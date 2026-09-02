class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;

        int min=10;
        for(int i=0; i<n; i++){
            for(int j=0;j<m;j++){
                if(nums1[i]==nums2[j]){
                    if(min>nums1[i]){
                        min=nums1[i];
                    }
                }
                  
            }
        }

        if(min!=10) return min;

        int smallest1=9;
        int smallest2=9;
        for(int i=0;i<n;i++){
            if(nums1[i]<smallest1) smallest1=nums1[i];
        }

        for(int i=0;i<m;i++){
            if(nums2[i]<smallest2) smallest2=nums2[i];
        }

        if(smallest1>smallest2) return smallest2*10 + smallest1;
        else return smallest1*10 + smallest2;
    }
}