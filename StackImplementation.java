public class StackImplementation {
    
  public static void main(String arg[]) throws Exception{
   stack Stack = new stack();
   Stack.push(1);
   Stack.push(2);
   Stack.push(3);
   Stack.push(4);
   Stack.push(5);
   Stack.push(6);
   Stack.display();
   System.out.println(Stack.pop());
   System.out.println(Stack.pop());
   System.out.println(Stack.pop());
   System.out.println(Stack.pop());
   Stack.display();
   

  }
}
