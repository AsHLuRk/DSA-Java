public class DynamicStack {
      int[] arr;
    protected static final int DEFAULT_SIZE = 10;
    int ptr =-1;
    
    public DynamicStack(int size){
        arr = new int[size];
    }
    public DynamicStack(){
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
    public void push(int val){
        if(isFull()){
            int[] temp = new int[arr.length*2];
          for(int i=0; i<arr.length; i++){
            temp[i] = arr[i];
          }
          arr = temp;
        }
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
