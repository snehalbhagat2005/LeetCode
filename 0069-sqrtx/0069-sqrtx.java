class Solution {
    public int mySqrt(int sqr) {
        if (sqr == 0 || sqr == 1) {
            return sqr;
        }
        int root = 1;
        int start = 0;
        int end = sqr;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == sqr / mid) {
                root = mid;
                return root;
            } else if (mid > sqr / mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
                root = mid;
            }
        }
        return root;
    }
}