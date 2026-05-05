
public class SegmentTree{




class Node{

   int data;
   int Startindex;
   int Endindex;
   Node left;
   Node right;

   public Node(int Startindex, int Endindex){

    this.Startindex = Startindex;
    this.Endindex = Endindex;
   }

}
Node root;
public SegmentTree(int arr[]){

this.root = constructTree(arr , 0 , arr.length-1);
}

public Node constructTree(int arr[] , int start , int end){

    if(start == end){
    //this will happen when the leaf is reached
     Node leaf= new Node(start, end);
     leaf.data = arr[start];
     return leaf;
    }
   //this will happen the other than the root node;

   Node node = new Node(start, end);

   int mid =(end+start)/2;

   node.left = constructTree(arr, start, mid);

   node.right = constructTree(arr, mid+1 , end);

   node.data = node.left.data +node.right.data;

   return node;
    
}
 public void display(){
   
    display(root , 0);

    
 }
 public void display(Node node , int level){
    if(node ==null){
        return;
    }

    display(node.right , level+1);

    if(level!=0){
        
        for(int i=0; i<level; i++){
            System.out.print("\t \t");
        }
        System.out.println("----->"+"["+node.Startindex +","+node.Endindex+"], "+node.data);
    }
    else{
        System.out.println("["+node.Startindex +","+node.Endindex+"], "+node.data);
    }
    display(node.left , level+1);
 }

 public int sum(int start , int end){

     return sum(root , start , end );
 }
 public int sum(Node node , int start, int end){

    if(start>node.Endindex || end<node.Startindex){
        return 0;
    }
    if(start>=node.Startindex && end<=node.Endindex){
       return node.data;
    }

    return sum(node.left, start, end)+sum(node.right, start, end);
 }


}