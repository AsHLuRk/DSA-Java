public class DynamicCQ {
    
    int[] arr;
    int front =0;
    int End = 0;
    private static final int DEFAULT_SIZE = 10;

    public DynamicCQ(){
arr = new int[DEFAULT_SIZE];
    }
    public DynamicCQ(int size){
arr = new int[size];
    }

public boolean isFull(){
    return (End+1)%arr.length==front;
}
public boolean isEmpty(){
    return front==End;
}
public void push(int val){
    if(isFull()){
        int[] temp = new int[arr.length*2];
        int copy =front;
        int i=0;
        while(copy!=End){
            temp[i]=arr[copy];
            i++;
            copy = (copy+1)%arr.length;
        }
        arr= temp;
        End = i;
        front =0;

    }
    arr[End++] = val;
    End = End%arr.length;
}
public void pop(){
    if(isEmpty()){
        System.out.println("QUEUE IS EMPTY");
        return;
    }
    front++;
    front = front%arr.length;
}
public void display(){
    if(isEmpty()){
        System.out.println("No element is present");
        return;
    }
    int temp = front;
    while(temp!=End){
        System.out.print(arr[temp]+" -> ");
        temp++;
        temp = temp%arr.length;
    }
    
}
}
