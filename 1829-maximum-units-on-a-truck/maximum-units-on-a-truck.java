class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, (a,b)->(b[1]-a[1]));
        
        int sizeremain = truckSize;
        int max_unit = 0;
        for(int i=0; i<boxTypes.length; i++){
            if(boxTypes[i][0]<sizeremain){
              sizeremain-=boxTypes[i][0];
              max_unit = max_unit + boxTypes[i][0]*boxTypes[i][1];
            }
            else if(boxTypes[i][0]>=sizeremain){
                max_unit = max_unit + sizeremain*boxTypes[i][1];
                break;
            }
            
        }
        return max_unit;
    }
}