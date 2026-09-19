class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j] && nums[j] !=0){
                    nums[i]=0;
                    nums[j]=0;
                }
            }
        }

        int single=0;
        for(int i=0;i<n;i++){
            if(nums[i] != 0){
                single=nums[i];
            }
        }

        return single;
    }
}