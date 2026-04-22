import javax.swing.text.DefaultEditorKit.InsertBreakAction;

public class BST {
    

    class Node{

        Node left;
        Node right;
        int val;
        int height;

        public Node(int value){
            this.val = value;
        }
       
     public boolean isEmpty(){
        return root==null;
    }
     
    }
    public BST(){

    }
    Node root;

    public int height(Node node){
        return (node==null)?-1 :node.height;
    }

    public void insert( int value){
       root = insert(root, value);
    }

    public Node insert(Node node , int value){

      if(node==null){
         Node node1 = new Node(value);
         return node1;
      }

     if(value<node.val){
        node.left = insert(node.left, value);
     }

     if(value>node.val){
        node.right = insert(node.right, value);
     }
     node.height = Math.max( height(node.right) , height(node.left))+1;
     return node;
    }

    public boolean isBalanced(){

      return isBalanced(root);
    }

    public boolean isBalanced(Node node){

        if(node==null){
            return true;
        }





        
        int balanceFactor = Math.abs(height(node.left) - height(node.right));

    // 2. A node is balanced if:
    //    - Its own balance factor is <= 1
    //    - AND its left subtree is balanced
    //    - AND its right subtree is balanced
    return balanceFactor <= 1 && isBalanced(node.left) && isBalanced(node.right);
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
        System.out.println("|------>"+node.val);
     }
     else{
        System.out.println(node.val);
     }
     prettydisplay(node.left, level+1);
   }
    
   
}
