class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;

        if(n<3) return false;

        if(n==3){
        if(arr[0]<arr[1] && arr[1]>arr[2])
            return true;
        else
            return false;
        }

        int peak = 0;
        while (peak < n-1 && arr[peak] < arr[peak + 1]) {
            peak++;
        }

        if (peak == 0 || peak == n - 1) {
            return false;
        }

        while (peak < n-1 && arr[peak] > arr[peak + 1]) {
            peak++;
        }
        

        return peak == n - 1;

        // int start=1;
        // int end=n-2;

        // int peak=-1;
        // while(start<=end){
        //     int mid=start+(end-start)/2;

        //     if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
        //         peak=mid;
        //         break;
        //     }else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
        //         start=mid+1;
        //     }else if(arr[mid]==arr[mid-1] || arr[mid]==arr[mid+1] ){
        //         return false;
        //     }else{
        //         end=mid-1;
        //     }
        // }

        // for(int i=peak-1; i>0; i--){
        //     if(arr[i]>=arr[i+1]){
        //         return false;
        //     }
        // }

        // for(int i=peak; i<n-1; i++){
        //     if(arr[i]<= arr[i+1]){
        //         return false;
        //     }
        // }

        // return true;
    }
}