class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int startRow = 0;
        int startCol = 0;
        int endRow = mat.length-1;
        int endCol = mat[0].length-1;
        
        while(startRow <= endRow && startCol <=endCol){
            
            for(int j =startCol;j<=endCol;j++){
                ans.add(mat[startRow][j]);
            }
             for(int i =startRow+1;i<=endRow;i++){
                ans.add(mat[i][endCol]);
            }
            if(startRow<endRow){
              for(int j =endCol-1;j>=startCol;j--){
                ans.add(mat[endRow][j]);
            }
            }
            if(startCol<endCol && startRow<endRow ){
             for(int i = endRow-1;i>startRow;i--){
                ans.add(mat[i][startCol]);
            }
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        return ans;
    }
}
