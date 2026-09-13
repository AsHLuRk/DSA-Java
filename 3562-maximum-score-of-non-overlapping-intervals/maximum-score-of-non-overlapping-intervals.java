class Solution {
    public int[] maximumWeight(List<List<Integer>> intervals) {
        int n = intervals.size();
        int[][] arr = new int[n][4]; // l, r, w, originalIdx
        for (int i = 0; i < n; i++) {
            List<Integer> iv = intervals.get(i);
            arr[i][0] = iv.get(0);
            arr[i][1] = iv.get(1);
            arr[i][2] = iv.get(2);
            arr[i][3] = i;
        }
        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            if (a[1] != b[1]) return a[1] - b[1];
            if (a[2] != b[2]) return a[2] - b[2];
            return a[3] - b[3];
        });

        // nxt[i] = first index j > i (sorted order) with arr[j][0] > arr[i][1]
        int[] nxt = new int[n];
        for (int i = 0; i < n; i++) {
            int lo = i + 1, hi = n, r = arr[i][1];
            while (lo < hi) {
                int mid = (lo + hi) >>> 1;
                if (arr[mid][0] > r) hi = mid;
                else lo = mid + 1;
            }
            nxt[i] = lo;
        }

        long[][] f = new long[n + 1][5];
        @SuppressWarnings("unchecked")
        List<Integer>[][] g = new List[n + 1][5];
        for (int k = 0; k <= 4; k++) g[n][k] = new ArrayList<>();

        for (int i = n - 1; i >= 0; i--) {
            g[i][0] = new ArrayList<>();
            for (int k = 1; k <= 4; k++) {
                // skip interval i
                long s1 = f[i + 1][k];
                List<Integer> a1 = g[i + 1][k];

                // take interval i
                long s2 = f[nxt[i]][k - 1] + arr[i][2];
                List<Integer> a2 = new ArrayList<>(g[nxt[i]][k - 1]);
                int pos = Collections.binarySearch(a2, arr[i][3]);
                if (pos < 0) pos = -(pos + 1);
                a2.add(pos, arr[i][3]);

                if (s2 > s1 || (s2 == s1 && lexSmaller(a2, a1))) {
                    f[i][k] = s2;
                    g[i][k] = a2;
                } else {
                    f[i][k] = s1;
                    g[i][k] = a1;
                }
            }
        }

        List<Integer> res = g[0][4];
        int[] ans = new int[res.size()];
        for (int j = 0; j < ans.length; j++) ans[j] = res.get(j);
        return ans;
    }

    private boolean lexSmaller(List<Integer> a, List<Integer> b) {
        int len = Math.min(a.size(), b.size());
        for (int i = 0; i < len; i++) {
            int cmp = Integer.compare(a.get(i), b.get(i));
            if (cmp != 0) return cmp < 0;
        }
        return a.size() < b.size();
    }
}