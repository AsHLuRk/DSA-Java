
class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        // Sort logs by time
        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));

        // Sort query indices by query value
        int m = queries.length;
        Integer[] order = new Integer[m];
        for (int i = 0; i < m; i++) order[i] = i;
        Arrays.sort(order, (a, b) -> Integer.compare(queries[a], queries[b]));

        int[] cnt = new int[n + 1];
        int active = 0;          // servers with at least one request in the window
        int left = 0, right = 0; // window is logs[left..right-1]
        int[] ans = new int[m];

        for (int idx : order) {
            int q = queries[idx];

            // Add logs with time <= q
            while (right < logs.length && logs[right][1] <= q) {
                if (cnt[logs[right][0]]++ == 0) active++;
                right++;
            }

            // Remove logs with time < q - x
            while (left < right && logs[left][1] < q - x) {
                if (--cnt[logs[left][0]] == 0) active--;
                left++;
            }

            ans[idx] = n - active;
        }

        return ans;
    }
}