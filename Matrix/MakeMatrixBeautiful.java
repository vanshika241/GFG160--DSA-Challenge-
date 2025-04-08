class Solution {
    public static int findMinOperation(int[][] mat) {
        // code here
       int n = mat.length;
       int m = mat[0].length;
       int rowSum[] = new int[n];
       int colSum[] = new int[m];
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               rowSum[i] += mat[i][j];
               colSum[j] += mat[i][j];
           }
       }
       
       int maxSum = 0;// from both row and columns
       for(int i=0;i<n;i++){
           maxSum = Math.max(maxSum, rowSum[i]);
           maxSum = Math.max(maxSum, colSum[i]);
       }
       
       int ans = 0;
       for(int i=0;i<n;i++){
           ans += maxSum - rowSum[i];
       }
       return ans;
    }
}
