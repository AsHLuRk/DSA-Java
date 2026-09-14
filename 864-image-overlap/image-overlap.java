class Solution {
 public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        List<Integer> ones1 = new ArrayList<>();
        List<Integer> ones2 = new ArrayList<>();

        // Store 1D encoded coordinates for all 1s
        for (int i = 0; i < n * n; i++) {
            if (img1[i / n][i % n] == 1) ones1.add(i);
            if (img2[i / n][i % n] == 1) ones2.add(i);
        }

        // Frequency table for shift vectors offset by +n to avoid negative indices
        int[][] count = new int[2 * n][2 * n];
        int maxOverlap = 0;

        for (int p1 : ones1) {
            int r1 = p1 / n, c1 = p1 % n;
            for (int p2 : ones2) {
                int r2 = p2 / n, c2 = p2 % n;
                int dr = r1 - r2 + n;
                int dc = c1 - c2 + n;
                count[dr][dc]++;
                maxOverlap = Math.max(maxOverlap, count[dr][dc]);
            }
        }

        return maxOverlap;
    }
}