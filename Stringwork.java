public class Stringwork {
    public static void main(String arg[]){

    String ab = "awhbehfweuiuandlfsgrefeef;rekofqwidlzzuadaduzsdbadhuzdzkdzczuszbsfudzbzdfkuzd";

    StringBuilder sb = new StringBuilder(ab);

      ab = remove(sb, 'z', 0);
      System.out.println(ab);
      


    }
    public static String remove(StringBuilder s1 , char a ,int i){
     
       if(i==s1.length()){
      return s1.toString();
       }

     else if(s1.charAt(i)==a){
        s1.deleteCharAt(i);
       return remove(s1, a, i);
     }
     else{
        return remove(s1, a, i+1);
     }

       

    }
}

