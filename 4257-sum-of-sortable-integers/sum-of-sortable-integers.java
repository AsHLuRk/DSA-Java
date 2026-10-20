class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int k = 1; k <= n; k++) {
            if (n % k != 0) continue;
            if (check(nums, n, k)) ans += k;
        }
        return ans;
    }

    private boolean check(int[] a, int n, int k) {
        int prevMax = 0; // values are >= 1

        for (int s = 0; s < n; s += k) {
            int e = s + k - 1;
            int descents = 0, pos = -1;

            for (int i = s; i < e; i++) {
                if (a[i] > a[i + 1]) {
                    if (++descents > 1) return false;
                    pos = i;
                }
            }

            int mn, mx;
            if (descents == 0) {
                mn = a[s];
                mx = a[e];
            } else {
                if (a[e] > a[s]) return false; // wrap-around would be a 2nd descent
                mn = a[pos + 1];
                mx = a[pos];
            }

            if (mn < prevMax) return false;
            prevMax = mx;
        }
        return true;
    }
}