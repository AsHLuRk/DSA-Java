public class BSTimp {
    
    public static void main(String arg[]){

        BST bs1 = new BST();

        bs1.insert(5);
        bs1.insert(2);
        bs1.insert(7);
        bs1.insert(1);
        bs1.insert(4);
        bs1.insert(6);
        bs1.insert(9);
        bs1.insert(8);
        bs1.insert(3);
        bs1.insert(10);

        bs1.prettydisplay();
        System.out.println(bs1.isBalanced());

    }
}
