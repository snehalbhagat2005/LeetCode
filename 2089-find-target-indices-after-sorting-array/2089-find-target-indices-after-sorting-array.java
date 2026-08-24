class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        int n=arr.length;
        Arrays.sort(arr);
        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(arr[i]==target){
                ans.add(i);
            }
        }

        return ans;
    }
}