class Solution {
    public int maximumCount(int[] arr) {
        int n=arr.length;

        if(arr[0]==0 && arr[n-1]==0) return 0;
        int start =0;
        int end=n-1;

        int largestNegative=-1;
        while(start<=end){
            int mid=(int)(start+end)/2;
            if(arr[mid]<0){
                largestNegative=mid;
                start=mid+1;;
            }
            else{
                end=mid-1;
            }
            
        }


        start =0;
        end=n-1;

        int smallestPositive=-1;
        while(start<=end){
            int mid=(int)(start+end)/2;
            if(arr[mid]>0){
                smallestPositive=mid;
                end=mid-1;
                
            }
            else{
                start=mid+1;;
            }
            
        }

        int negCount=largestNegative+1;
        int posCount=0;
        if(smallestPositive==-1) 
            posCount=0;
        else
            posCount=n-smallestPositive;

        int max=0;

        if(negCount>posCount){
            max=negCount;
        }else{
            max=posCount;
           
        }

        return max;
    }
}