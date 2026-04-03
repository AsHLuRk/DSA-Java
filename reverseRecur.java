public class reverseRecur {
    
    public static void main(Stringtest arg[]){

       System.out.println(reversedigi(156,0));

    }

    public static int reversedigi(int n, int ans){

        if(n/10==0){
            ans = ans+n;
            return ans;
        }
        return reversedigi(n/10, (ans+n%10)*10);
       
    }
}
