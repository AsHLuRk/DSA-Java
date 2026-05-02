public class AVLimp {
     public static void main(String args[]){

          AVL avl1 = new AVL();

        avl1.insert(1);
        avl1.insert(2);
        avl1.insert(3);
        avl1.insert(4);
        avl1.insert(5);
        avl1.insert(6);
        avl1.insert(7);
        avl1.insert(8);
        avl1.insert(9);
        avl1.insert(10);

        avl1.prettydisplay();
        System.out.println(avl1.isBalanced());
     }
}
