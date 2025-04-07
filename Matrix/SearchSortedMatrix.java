class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int start = 0;
        int end = n*m-1;
        while(start <= end){
            int mid = start +(end-start)/2;
            int row = mid/m;
            int col  = mid%m;
            if(mat[row][col] == x){
                return true;
            }
            else if(mat[row][col] > x){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
}
