class Solution {
    public boolean validPalindrome(String s) {
    //     int start = 0;
    //     int end = s.length()-1;
    //     boolean available = true;

    //     while(start<=end){

    //         if(s.charAt(start)==s.charAt(end)){
    //             start++;
    //             end--;
    //         }
    //         else if(s.charAt(start)!=s.charAt(end) && available){
    //            if(s.charAt(start)==s.charAt(end-1) && s.charAt(start+1)!=s.charAt(end)){
    //             end--;
    //             available = false;
    //            }
    //            else if(s.charAt(start)!=s.charAt(end-1) && s.charAt(start+1)==s.charAt(end)){
    //             start++;
    //             available = false;
    //            }
    //            else{
    //              return palcheck(s.substring(0,start)+s.substring(start+1, s.length())) || palcheck(s.substring(0,end)+s.substring(end+1, s.length())); 
    //            }
    //         }
    //         else{
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public boolean palcheck(String s){
    //     int start = 0 ;
    //     int end = s.length()-1;
    //     while(start<end){
    //         if(s.charAt(start)!=s.charAt(end)){
    //             return false;
    //         }
    //         if(s.charAt(start)==s.charAt(end)){
    //             start++;
    //             end--;
    //         }

    //     }
    //     return true;
      
      int i =0;
      int j = s.length()-1;
      

      while(i<j){
        if(s.charAt(i)!=s.charAt(j) ){
            return palcheck(s , i+1 ,j) || palcheck(s,i , j-1);
        }
       i++;
       j--;
      }
      return true;

    }
     public boolean palcheck(String s, int i , int j){
   
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
           
                i++;
                j--;
            
        }
        return true;


    }
    
}