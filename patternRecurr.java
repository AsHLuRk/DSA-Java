public class patternRecurr {
    
    public static void main(Stringtest ar[]){
     pattern(7);
        
    }
    static void pattern(int n){

        if(n==0){
            return;
        }
        for(int i =0; i<n; i++){
            System.out.print("*");
        }
        System.out.println();
        pattern(n-1);
    }
    
}
