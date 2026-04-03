public class DL {
    

    private Node head;

    private int size;

    
    public DL(){
        size =0;
    }

   
    public void insertfirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
    }

    public void insertlast(int value){

        Node temp = head; 
        while(temp.next!=null){
            temp = temp.next;
        }
        Node node = new Node(value);
        node.prev = temp;
        node.next = null;
        temp.next = node;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public class Node {
    
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node prev , Node next){
            this.prev = prev;
            this.next = next;
        }
    }
}
