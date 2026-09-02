class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int doubleLen=2*n;
        int[] arr=new int[doubleLen];

        for(int i=0;i<n;i++){
            arr[i]=nums[i];
            arr[i+n]=nums[i];
        }

        return arr;
    }
}