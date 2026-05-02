import javax.swing.text.DefaultEditorKit.InsertBreakAction;

public class AVL {
    

    class Node{

        Node left;
        Node right;
        int val;
      
        public Node(int value){
            this.val = value;
        }
       
   
     
    }
    public AVL(){

    }
    Node root;
    public boolean isEmpty(){
        return root==null;
    }
    public int height(Node node){

         return height(node , 0);
    }
    public int height(Node node, int height){
        if(node == null){
            return -1;
        }

        if(node.left == null && node.right == null){
            return 0;
        }
        
        
        int left = height(node.left , height+1);
        int right = height(node.right, height+1);

        return Math.max(left , right)+1;
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
     return rotate(node);
    }

    public Node rotate(Node node){
        if(height(node.left)- height(node.right)>1){
             
          if(height(node.left.left) - height(node.left.right) >0){
            return rightrotate(node);
          }
          if(height(node.left.left) - height(node.left.right) <0){
            node.left = leftrotate(node.left);
            return rightrotate(node);
          }
        }
        if(height(node.right)- height(node.left)>1){
             
          if(height(node.right.right) - height(node.right.left) >0){
            return leftrotate(node);
          }
          if(height(node.right.right) - height(node.right.left) <0){
            node.right = rightrotate(node.right);
            return leftrotate(node);
          }
        }
        

        return node;

    }

    public Node rightrotate(Node node){

      Node c = node.left;
      Node t = c.right;

      c.right = node;
      node.left = t;

      return c;

    }

    public Node leftrotate(Node node){

        Node c = node.right;
        Node t = c.left;

       c.left = node;
       node.right = t;
       return c;
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
