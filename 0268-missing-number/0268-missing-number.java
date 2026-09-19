class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;

        int[] flag=new int[n+1];
        for(int i=0; i<n+1; i++){
            flag[i]=-1;
        }

        for(int i=0;i<n;i++){
            if(nums[i]==0) continue;
            flag[nums[i]]=1;
        }

        int missing=0;

        for(int j=1;j<=n;j++){
            if(flag[j]==-1)
                missing=j;

        }

        return missing;
    }
}