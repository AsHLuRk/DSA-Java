public class StringSkip {
    public static void main(String arg[]){

        String a = "anfaufb dbaayush abujsfiasffjaayush abaiuf bauayush baufauiaayush";
        System.out.println(skip(a));

    }
    public static String skip(String s){

        if(s.isEmpty()){
            return "";
        }

        if(s.startsWith("aayush")){
            return skip(s.substring(6));
        }
        else{
            return s.charAt(0)+skip(s.substring(1));
        }
    }
}
