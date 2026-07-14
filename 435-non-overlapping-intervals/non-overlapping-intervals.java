class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
   
        
        Arrays.sort(intervals , (a,b)->a[1]-b[1]);
        int end =intervals[0][1];
        int removals=0;
        for(int i=1; i<intervals.length; i++){
           
            int currstart = intervals[i][0];
            int currend = intervals[i][1];

            if(currstart<end){
                removals++;
            }
            else{ 

            end = currend;
            }
        }
        return removals;
    }
}