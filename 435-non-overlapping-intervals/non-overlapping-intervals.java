class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        ArrayList<Integer> indexes = new ArrayList<>();

        for(int i=0; i<intervals.length; i++){
            indexes.add(i);
        }
        Collections.sort(indexes , (a,b)->(intervals[a][1]-intervals[b][1]));

        int end =intervals[indexes.get(0)][1];

        int removals=0;

        for(int i=1; i<intervals.length; i++){
           
            int currstart = intervals[indexes.get(i)][0];
            int currend = intervals[indexes.get(i)][1];

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