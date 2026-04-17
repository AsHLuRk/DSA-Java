import java.util.Scanner;

public class BinaryTreeimp {
    
    public static void main(String[] args) {
        
        Scanner scn  = new Scanner(System.in);
        BinaryTree bt  = new BinaryTree();
        bt.populate(scn);
        bt.prettydisplay();
    }
}
