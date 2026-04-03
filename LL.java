public class LL {
    


    private Node head;
    private Node tail;

    private int size;
    public LL(){
        size = 0;
    }

    public void insertfirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail==null){
            tail = head;
        }
        size++;
    }

    public void deletefirst(){

        head = head.next;
        size--;
    }

    public void deletelast(){

        Node temp = head;
        int index =0;
        while(index<size-2){
            temp = temp.next;
            index++;
        }
          tail = temp; 
          temp.next = null;
          size--;
    }

    public void deleteAt(int index){
        if(index==0){
            deletefirst();
            return;
        }
        if(index==size-1){
            deletelast();
            return;
        }
        Node temp = head;
        int i =0;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
          temp.next = (temp.next).next;
          size--;
    }
    
    public void insertRecur(int value, int index){
   
         head = insertRecur(value, index, head);

    }
    public Node insertRecur(int value , int index , Node node){

        if(index==0){
            Node new1 = new Node(value);
            size++;
            return new1;
        }

        node.next = insertRecur(value, index--, node.next);
        return node;
    }
    public void insertAt(int index ,int value){
        Node node = new Node(value);
        Node temp = head;
        int i=0;
        if(index>=size){
            System.out.println("Index Out Of bound");
            return;
        }
        if(index==0){
            insertfirst(value);
            return;
        }
        if(index ==size){
            insertlast(value);
        }
        while(i<index){

            temp = temp.next;
            i++;
            if(i+1 == index){
            node.next = temp.next;
            temp.next = node;
            size++;
            }
        }
    }
    public void insertlast(int value){
        if(tail == null){
            insertfirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node; 
        tail = node;
        size++;
    }
    public void display(){
        
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
        System.out.println("END");
        
    }


    private class Node{


        int value; 
        Node next;


        public Node( int value ,Node node){
            this.next = node;
            this.value =value;
        }

        public Node(int value){
            this.value = value;
        }
    }
}
