

class Solution {
    public long minOperations(int[] nums, int x, int k) {
        int n = nums.length;

        // coordinate compression
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int[] vals = new int[n];
        int m = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || sorted[i] != sorted[i - 1]) vals[m++] = sorted[i];
        }
        int[] rank = new int[n];
        for (int i = 0; i < n; i++) {
            rank[i] = Arrays.binarySearch(vals, 0, m, nums[i]) + 1;
        }

        // Fenwick trees over compressed values: counts and sums
        long[] cnt = new long[m + 1];
        long[] sum = new long[m + 1];
        int LOG = Integer.highestOneBit(m);

        // cost[s] = min ops to make nums[s..s+x-1] all equal
        long[] cost = new long[n - x + 1];
        long total = 0;
        int kth = (x + 1) / 2;

        for (int i = 0; i < n; i++) {
            // add nums[i] to the window
            for (int p = rank[i]; p <= m; p += p & -p) {
                cnt[p] += 1;
                sum[p] += nums[i];
            }
            total += nums[i];

            // remove the element leaving the window
            if (i >= x) {
                for (int p = rank[i - x]; p <= m; p += p & -p) {
                    cnt[p] -= 1;
                    sum[p] -= nums[i - x];
                }
                total -= nums[i - x];
            }

            if (i >= x - 1) {
                // kth smallest (median) via BIT descent
                int pos = 0, rem = kth;
                for (int pw = LOG; pw > 0; pw >>= 1) {
                    if (pos + pw <= m && cnt[pos + pw] < rem) {
                        pos += pw;
                        rem -= cnt[pos];
                    }
                }
                int medRank = pos + 1;
                long med = vals[medRank - 1];

                // prefix count and sum of elements <= median
                long cntLE = 0, sumLE = 0;
                for (int p = medRank; p > 0; p -= p & -p) {
                    cntLE += cnt[p];
                    sumLE += sum[p];
                }
                long cntGT = x - cntLE;
                long sumGT = total - sumLE;
                cost[i - x + 1] = (med * cntLE - sumLE) + (sumGT - med * cntGT);
            }
        }

        // dp[j][i] = min cost using j non-overlapping windows in first i elements
        final long INF = Long.MAX_VALUE / 4;
        long[] prev = new long[n + 1]; // j = 0 -> all zeros
        for (int j = 1; j <= k; j++) {
            long[] cur = new long[n + 1];
            Arrays.fill(cur, INF);
            for (int i = 1; i <= n; i++) {
                cur[i] = cur[i - 1];
                if (i >= x && prev[i - x] < INF) {
                    cur[i] = Math.min(cur[i], prev[i - x] + cost[i - x]);
                }
            }
            prev = cur;
        }
        return prev[n];
    }
}