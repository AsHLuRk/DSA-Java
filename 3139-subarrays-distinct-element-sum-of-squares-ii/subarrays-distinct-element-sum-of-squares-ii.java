class Solution {
    static final int MOD = 1_000_000_007;
    long[] s1, s2;
    int[] lazy;

    public int sumCounts(int[] nums) {
        int n = nums.length;
        s1 = new long[4 * n];
        s2 = new long[4 * n];
        lazy = new int[4 * n];

        int[] last = new int[100_001];
        java.util.Arrays.fill(last, -1);

        long ans = 0;
        for (int r = 0; r < n; r++) {
            int v = nums[r];
            update(1, 0, n - 1, last[v] + 1, r);
            last[v] = r;
            ans = (ans + s2[1]) % MOD;
        }
        return (int) ans;
    }

    private void apply(int node, int len, int v) {
        s2[node] += 2L * v * s1[node] + (long) v * v * len;
        s1[node] += (long) v * len;
        lazy[node] += v;
    }

    private void push(int node, int lo, int hi) {
        if (lazy[node] != 0) {
            int mid = (lo + hi) >>> 1;
            apply(node * 2, mid - lo + 1, lazy[node]);
            apply(node * 2 + 1, hi - mid, lazy[node]);
            lazy[node] = 0;
        }
    }

    private void update(int node, int lo, int hi, int l, int r) {
        if (l <= lo && hi <= r) {
            apply(node, hi - lo + 1, 1);
            return;
        }
        push(node, lo, hi);
        int mid = (lo + hi) >>> 1;
        if (l <= mid) update(node * 2, lo, mid, l, r);
        if (r > mid) update(node * 2 + 1, mid + 1, hi, l, r);
        s1[node] = s1[node * 2] + s1[node * 2 + 1];
        s2[node] = s2[node * 2] + s2[node * 2 + 1];
    }
}