class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;

        if (n == 0) return;
         k = k % n;

        // int temp=0;

        // for(int i=0;i<k;i++){
        //     temp=nums[n-1];
        //     for(int j=n-1;j>0;j--){
        //         nums[j]=nums[j-1];
        //     }
        //     nums[0]=temp;
        // }

        reverse(nums, 0, n - 1); // Step 1
        reverse(nums, 0, k - 1); // Step 2
        reverse(nums, k, n - 1); // Step 3

    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}