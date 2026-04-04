public class CircularQueue {
    
    int[] arr;
    int front =0;
    int End = 0;
    private static final int DEFAULT_SIZE = 10;

    public CircularQueue(){
arr = new int[DEFAULT_SIZE];
    }
    public CircularQueue(int size){
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
        front = (front + 1) % arr.length;  
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
        temp = (temp+1)%arr.length;
    }
    
}
}
