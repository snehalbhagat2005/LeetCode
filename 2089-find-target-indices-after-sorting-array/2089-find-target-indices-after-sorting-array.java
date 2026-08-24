class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        int n=arr.length;
        Arrays.sort(arr);
        List<Integer> ans=new ArrayList<>();

        // for(int i=0;i<n;i++){
        //     if(arr[i]==target){
        //         ans.add(i);
        //     }
        // }

        int start =0;
        int end=n-1;
        int index=-1;

        while(start<=end){
            int mid=(int)(start+end)/2;
            if(arr[mid]==target){
                index=mid;
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        int lastIndex=-1;

        start =0;
        end=n-1;
        while(start<=end){
            int mid=(int)(start+end)/2;
            if(arr[mid]==target){
                lastIndex=mid;
                start=mid+1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        if(index==-1) return ans;

        for(int i=index;i<=lastIndex;i++){
            ans.add(i);
        }

        return ans;
    }
}