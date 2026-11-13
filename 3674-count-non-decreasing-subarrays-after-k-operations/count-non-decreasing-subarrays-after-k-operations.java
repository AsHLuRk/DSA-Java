class Solution {
    public long countNonDecreasingSubarrays(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> dq = new ArrayDeque<>(); // indices of prefix-max records, increasing index
        long S = 0;     // sum of prefix maxima over window [l..r]
        long sum = 0;   // sum of nums over window [l..r]
        long ans = 0;
        int r = n - 1;

        for (int l = n - 1; l >= 0; l--) {
            sum += nums[l];

            // absorb records that are no longer records because of nums[l]
            while (!dq.isEmpty() && nums[dq.peekFirst()] <= nums[l]) {
                int p = dq.pollFirst();
                int end = dq.isEmpty() ? r : dq.peekFirst() - 1;
                S -= (long) nums[p] * (end - p + 1);
            }
            int end = dq.isEmpty() ? r : dq.peekFirst() - 1;
            S += (long) nums[l] * (end - l + 1);
            dq.addFirst(l);

            // shrink from the right while cost exceeds k
            while (S - sum > k) {
                int q = dq.peekLast();
                S -= nums[q];
                sum -= nums[r];
                if (q == r) dq.pollLast();
                r--;
            }

            ans += r - l + 1;
        }
        return ans;
    }
}