class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] diff = new int[capacity.length];
        for(int i=0; i<diff.length; i++){
            diff[i] = capacity[i]-rocks[i];
        }

        Arrays.sort(diff);
        int count =0;
        for(int i=0; i<diff.length; i++){
            if(additionalRocks!=0 && diff[i]<=additionalRocks){
                additionalRocks= additionalRocks-diff[i];
                count++;
                
            }
           else if(diff[i]==0){
                count++;
            }
        }
        return count;
    }
}