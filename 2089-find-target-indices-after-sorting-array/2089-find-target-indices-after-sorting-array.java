class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        List<Integer> ans=new ArrayList<>();
        int n=arr.length;
        if(n==0 ) return ans;
        

        Arrays.sort(arr);

        
        int start=0;
        int end=n-1;
        int first=-1;
        int last=-1;

        while(start<=end){
            int mid=(int)(start+end)/2;
            if(arr[mid]==target){
                start=mid+1;
                last=mid;
            }else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

         start=0;
         end=n-1;
        while(start<=end){
            int mid=(int)(start+end)/2;
            if(arr[mid]==target){
                end=mid-1;
                first=mid;
            }else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

        if(first==-1) return ans;

        for(int i=first;i<=last;i++){
            ans.add(i);
        }
        return ans;
    }
}