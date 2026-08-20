class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n=matrix.length;
        int m=matrix[0].length;

        int col=m-1;
        int i=0;
        while(i<n && col>=0){
            if(matrix[i][col]==target){
                return true;
            }
            else if(matrix[i][col]<target){
                i++;
            }
            else{
                col--;
            }
            
        }
        return false;
    }
}