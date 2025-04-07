class Solution {
    // Function to rotate matrix anticlockwise by 90 degrees.
    public static void reverse(int arr[]){
        int i=0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotateby90(int mat[][]) {
        // code here
        for(int i=0;i<mat.length;i++){
            reverse(mat[i]);
        }
        
        for(int i=0;i<mat.length;i++){
            for(int j=i+1;j<mat[i].length;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
}
