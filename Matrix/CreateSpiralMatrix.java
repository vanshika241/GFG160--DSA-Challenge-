class Solution {
    public int[][] spiralFill(int n, int m, int[] arr) {
        // code here
        int ans[][] = new int[n][m];
        int startCol = 0;
        int endCol = m-1;
        int startRow = 0;
        int endRow = n-1;
        int k=0;
        while(startRow <=endRow && startCol<=endCol){
            for(int j=startCol;j<=endCol;j++ ){
                ans[startRow][j] = arr[k];
                k++;
            }
            
             for(int i=startRow+1;i<=endRow;i++ ){
                ans[i][endCol] = arr[k];
                k++;
            }
            if(startRow<endRow){
                for(int j=endCol-1;j>=startCol;j-- ){
                ans[endRow][j] = arr[k];
                k++;
            }
            }
            if(startCol<endCol && startRow<endRow){
               for(int i = endRow-1;i>startRow;i--){
                   ans[i][startCol] = arr[k];
                   k++;
               }
            }
            
            startCol++;
            startRow++;
            endRow--;
            endCol--;
        }
        return ans;
    }
}
