import java.util.*;

public class BinaryTree {
    
     public BinaryTree(){

    }
    class Node{
        int value;
        Node right;
        Node left;

       public Node(int value){
        this.value = value;
    }
    }
    private Node root;
    
    public void populate(Scanner scn){
    
    System.out.println("Enter the value root node: ");
    int value = scn.nextInt();
    root = new Node(value);
    populate(root , scn);
    }
    public void populate(Node node , Scanner scn){

        System.out.println("Do you want to add Node left to: "+node.value);
        boolean left = scn.nextBoolean();
        if(left){
            System.out.println("Enter the value of the node: ");
            int value = scn.nextInt();
            node.left = new Node(value);
            populate(node.left , scn);
        }
          System.out.println("Do you want to add Node right to: "+node.value);
        boolean right = scn.nextBoolean();
        if(right){
            System.out.println("Enter the value of the node: ");
            int value = scn.nextInt();
            node.right = new Node(value);
            populate(node.right, scn);
        }
    }

    public void display(){
        display(root , "");
    }

    public void display(Node node , String intent){
        if(node == null){
            return;
        }
        System.out.println(intent + node.value);
        display(node.left
            , intent+"\t ");
        display(node.right, intent+"\t");
    }
   public void prettydisplay(){
        prettydisplay(root , 0);
   }
   public void prettydisplay(Node node , int level){
       
     if(node == null){
        return;
     }
     prettydisplay(node.right, level+1);

     if(level!=0){
        for(int i=0; i<level; i++){
            System.out.print("\t \t");   
        }
        System.out.println("|------>"+node.value);
     }
     else{
        System.out.println(node.value);
     }
     prettydisplay(node.left, level+1);
   }
}
