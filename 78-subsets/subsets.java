class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        return ans(list, list2 , nums, 0);
    }
    public List<List<Integer>> ans(List<List<Integer>> list,  List<Integer> list2 , int[] nums, int i){
       
       list.add(new ArrayList<>(list2));

       for(int a=i; a<nums.length; a++){

        list2.add(nums[a]);

        ans(list, list2, nums , a+1);

        list2.remove(list2.size()-1);
       }
     
     return list;
    }
}