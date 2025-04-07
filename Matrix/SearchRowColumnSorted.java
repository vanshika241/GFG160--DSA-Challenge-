class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        int row = 0;
        int col = mat[0].length-1;
        while(row<mat.length && col >=0){
            if(mat[row][col] < x){
                row++;
            }
            else if(mat[row][col] > x){
                col--;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
