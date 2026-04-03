

public class Queue{

int[] arr;
int End = 0;
private final static int DEFAULT_SIZE = 10;
public Queue(){
    arr = new int[DEFAULT_SIZE];
}
public Queue(int size){
    arr = new int[size];
}
public boolean isEmpty(){
    
    return End==0;
}
public boolean isFull(){
    return End==arr.length;
}
public void push(int val) throws Exception{
    if(isFull()) {
 throw new Exception("QUEUE FULL");
    }
    arr[End++] = val;
    
}
public int pop()throws Exception{
    if(isEmpty()) throw new Exception("QUEUE IS EMPTY");

    int removed = arr[0];
   for(int i=0; i<End-1; i++){
    arr[i] = arr[i+1];
   }
    End--;
    return removed;
}
public int front(){
    if(isEmpty()){
        System.out.println("Queue is empty");
        return -1;
    }
    return arr[0];
}
public void display(){
    for(int i=0; i<End; i++){
        System.out.println(arr[i]);
    }
}

}