class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n=arr.length;

        int low=0;
        int high=n-1;

        if(n==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];

        int single=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==arr[mid+1]){
                int first=mid;
                int second=mid+1;
                if((first-low)%2==0){
                    low=second+1;
                }else{
                    high=first-1;
                }
            }
            else if(arr[mid]==arr[mid-1]){
                int first=mid-1;
                int second=mid; 
                if((first-low)%2==0){
                    low=second+1;    
                }else{  
                    high=first-1;
                }
            }
            else{    
                single=mid;
                return arr[single];
            }    
        } 
        return single;
    }
}