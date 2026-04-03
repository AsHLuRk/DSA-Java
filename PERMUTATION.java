public class PERMUTATION {
    public static void main(String arg[]){


        String s ="123";
        ans("", s);
    }

    public static void ans(String p , String up){
   if(up.isEmpty()){

      System.out.println(p);
      return;
   }

   for(int i=0; i<=p.length(); i++){

    ans(p.substring(i, p.length())+up.charAt(0)+p.substring(0,i), up.substring(1));
   }


    }
}
