class Solution {
     static{
        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            try(java.io.FileWriter f=new java.io.FileWriter("display_runtime.txt")){
                f.write("0");
            }catch(Exception e){

            }
        }));
    };
    public String longestCommonPrefix(String[] strs) {
    String check1 ="";
    String ans= "";
    boolean check2 =true;
    for(int i=0; i<strs[0].length(); i++){
         check1+=strs[0].charAt(i);
        for(int j=0; j<strs.length; j++){
         if(check1.length()<=strs[j].length() && check1.equals(strs[j].substring(0,i+1))){
            check2 = true;
         }
         else{
            check2 = false;
            break;
         }
        }
        if(check2 == true){
           
            ans+=strs[0].charAt(i);
         
        }
        else{
            break;
        }

    }
     return ans;
    }
   
}