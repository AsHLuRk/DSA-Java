class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
       int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

       int str_month = Integer.parseInt(arriveAlice.substring(0,2))-1;

       int end_month = Integer.parseInt(leaveAlice.substring(0,2))-1;
       int days =0;
       
       for(int i=str_month; i<=end_month; i++){
         if(i==str_month && str_month!=end_month){
            days =month_days[str_month]-Integer.parseInt(arriveAlice.substring(3,5))+1;
         }
         else if(i==end_month){
            days += Integer.parseInt(leaveAlice.substring(3,5))-Integer.parseInt(arriveAlice.substring(3,5))+1;
            break;
         }
         else{
            days += month_days[i];
         }
       }
       int str_month_2 = Integer.parseInt(arriveBob.substring(0,2))-1;

       int end_month_2 = Integer.parseInt(leaveBob.substring(0,2))-1;
       
       for(int i=str_month_2; i<=end_month_2; i++){
         if(i==str_month_2 && str_month_2!=end_month_2){
            days +=month_days[str_month_2]-Integer.parseInt(arriveBob.substring(3,5))+1;
         }
         else if(i==end_month_2){
            days += Integer.parseInt(leaveBob.substring(3,5))-Integer.parseInt(arriveBob.substring(3,5))+1;
            break;
         }
         else{
            days += month_days[i];
         }
       }
       

       String latter = ((Integer.parseInt(arriveAlice.substring(0,2)+arriveAlice.substring(3,5)))>(Integer.parseInt(arriveBob.substring(0,2)+arriveBob.substring(3,5))))?arriveAlice:arriveBob;

       String before = ((Integer.parseInt(leaveAlice.substring(0,2)+leaveAlice.substring(3,5)))<(Integer.parseInt(leaveBob.substring(0,2)+leaveBob.substring(3,5))))?leaveAlice:leaveBob;
       int days_minus = 0;

      // FIX 1: <= instead of < (a one-day overlap was returning 0)
      if((Integer.parseInt(latter.substring(0,2)+latter.substring(3,5)))<=(Integer.parseInt(before.substring(0,2)+before.substring(3,5)))){
        

        int srt_month_3 = Integer.parseInt(latter.substring(0,2))-1;

        int end_month_3 = Integer.parseInt(before.substring(0,2))-1;
       
       for(int i=srt_month_3; i<=end_month_3; i++){
         if(i==srt_month_3 && srt_month_3!=end_month_3){
            days_minus +=month_days[srt_month_3]-Integer.parseInt(latter.substring(3,5))+1;
         }
         else if(i==end_month_3){
            // FIX 2: subtract the start day only when start and end are in the same month
            int startDay = (srt_month_3==end_month_3) ? Integer.parseInt(latter.substring(3,5)) : 1;
            days_minus += Integer.parseInt(before.substring(3,5))-startDay+1;
            break;
         }
         else{
            days_minus += month_days[i];
         }
       }
      }

      days -= days-days_minus;

      return days;
    }
}