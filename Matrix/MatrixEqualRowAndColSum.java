class Solution {
    public int[][] generateMatrix(int[] rowSum, int[] colSum) {
        // code here
        int n = rowSum.length;
        int m = colSum.length;
        int ans[][] = new int[n][m];
        int i= 0;//row
        int j = 0;//col
        while(i<n && j<m){
            ans[i][j] = Math.min(rowSum[i],colSum[j]);
            
            rowSum[i] -= ans[i][j];
            colSum[j] -= ans[i][j];
            if(rowSum[i] ==0){
                i++;
            }
             if(colSum[j] ==0){
                j++;
            }
        }
        return ans;
    }
}
