class Solution {
    public int totalFruit(int[] fruits) {
        
        int max_count=0;
        int left =0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int right = 0; right<fruits.length; right++){
            int item = fruits[right];
            if(!map.containsKey(item)){
                map.put(item ,0);
            }
            map.put(item , map.get(item)+1);
            
            while(map.size()>2){
            int leftitem = fruits[left];
            if(map.get(leftitem)==1){
                map.remove(leftitem);
            }
            else{
                map.put(leftitem , map.get(leftitem)-1);
            }
            left++;
           }
            max_count = Math.max(max_count , right-left+1);

        }
        return max_count;
    }
}