class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int[] bitCount = new int[31];
        
        // Count the occurrences of each set bit across all numbers
        for (int num : nums) {
            for (int i = 0; i <= 30; i++) {
                if ((num & (1 << i)) != 0) {
                    bitCount[i]++;
                }
            }
        }
        
        long ans = 0;
        long MOD = 1_000_000_007;
        
        // Greedily construct k numbers to maximize their squares
        for (int i = 0; i < k; i++) {
            long current = 0;
            for (int bit = 0; bit <= 30; bit++) {
                if (bitCount[bit] > 0) {
                    current |= (1L << bit);
                    bitCount[bit]--;
                }
            }
            ans = (ans + (current * current) % MOD) % MOD;
        }
        
        return (int) ans;
    }
}