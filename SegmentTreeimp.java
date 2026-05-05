public class SegmentTreeimp {
    
    public static void main(String arg[]){

        SegmentTree st = new SegmentTree(new int[] {1,2,4,7,-10,5,-2,6,3});

        st.display();

        System.out.println(st.sum(2, 6));
    }
}
