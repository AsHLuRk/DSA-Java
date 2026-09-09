class Solution {
    public long countCommas(long n) {
     
     long p= 1000;
     long count =0;
     for(p=1000; p<=n; p=p*1000){
       count = count +(n-p+1);

       if(p>Long.MAX_VALUE/1000){
         break;
       }
     }
     return count;
    }
}