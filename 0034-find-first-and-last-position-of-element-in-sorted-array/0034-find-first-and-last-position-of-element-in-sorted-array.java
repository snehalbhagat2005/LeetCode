class Solution {
    public int[] searchRange(int[] arr, int target) {
        int n=arr.length;
        int[] ans=new int[2];
        
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
        ans[0]=index;

        int lastIndex=-1;

        start =0;
        end=n-1;
        while(start<=end){
            int mid=(int)(start+end)/2;
            if(arr[mid]==target){
                lastIndex=mid;
                start=mid+1;;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        ans[1]=lastIndex;

        return ans;
    }
}