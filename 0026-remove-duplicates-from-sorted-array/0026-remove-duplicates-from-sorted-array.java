class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;

        int ind=0;
        for(int i=0; i<n; i++){
            if(nums[i]!=nums[ind]){
                ind++;
                nums[ind]=nums[i];
            }
        }
        return ind+1;
    }
}