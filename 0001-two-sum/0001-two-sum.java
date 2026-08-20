class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] ans=new int[2];
        
        for(int i=0;i<n;i++){
            ans[0]=i;
            int sum=0;
            for(int j=i+1;j<n;j++){
                ans[1]=j;
                sum=nums[i]+nums[j];
                if(sum==target){
                    return ans;
                }   
            }

        }
        return ans;
    }
}