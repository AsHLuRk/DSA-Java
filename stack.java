import java.io.IOException;

public class stack {
 
    int[] arr;
    protected static final int DEFAULT_SIZE = 10;
    int ptr =-1;
    
    public stack(int size){
        arr = new int[size];
    }
    public stack(){
        arr = new int[DEFAULT_SIZE];
    }
    public boolean isFull(){
        if(ptr ==arr.length-1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(ptr==-1){
            return true;
        }
        return false;
    }
    public void push(int val) throws Exception{
        if(isFull())throw new Exception("STACK IS FULL!!");
        ptr++;
        arr[ptr] = val;
    }
    public int pop() throws Exception{
        if(isEmpty()) throw new Exception("STACK IS EMPTY");

        return arr[ptr--];
    }
    public int peek() throws Exception{
        if(isEmpty()) throw new Exception("THE STACK IS EMPTY");
        return arr[ptr];
    }
    public void display() {
    for (int i = ptr; i >= 0; i--) {
        System.out.println(arr[i]);
    }
}
    
}