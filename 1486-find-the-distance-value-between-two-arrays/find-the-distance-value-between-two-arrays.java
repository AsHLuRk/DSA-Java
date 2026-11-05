class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;

        for (int x : arr1) {
            // first index in arr2 with value >= x - d
            int lo = 0, hi = arr2.length;
            while (lo < hi) {
                int mid = lo + (hi - lo) / 2;
                if (arr2[mid] >= x - d) hi = mid;
                else lo = mid + 1;
            }
            // if that value is beyond x + d (or doesn't exist), x is valid
            if (lo == arr2.length || arr2[lo] > x + d) count++;
        }
        return count;
    }
}