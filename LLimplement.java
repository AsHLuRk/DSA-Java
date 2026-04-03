
public class LLimplement {
    
    public static void main(String[] args) {
        
        LL ll = new LL();
        ll.insertfirst(23);
        ll.insertfirst(24);
        ll.insertfirst(25);
        ll.insertfirst(26);
        ll.insertfirst(29);

     ll.display();

      ll.insertlast(101);
      ll.display();

      ll.insertAt(11, 404);
      ll.display();

    //   ll.deletefirst();
    //    ll.display();
    //   ll.deletelast();
    //    ll.display();

    //    ll.deleteAt(2);
    //     ll.display();
        ll.insertRecur(101, 2);
      
    }
}
