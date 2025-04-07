class Solution {
    public void reverse(int arr[]){
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
    public void rotateMatrix(int[][] mat) {
        // code here
        for(int i=0;i<mat.length;i++){
            reverse(mat[i]);
        }
        int n = mat.length;
        for(int i=0;i<mat.length/2;i++){
            int temp[] = mat[i];
            mat[i] = mat[n-1-i];
            mat[n-1-i] = temp;
        }
    }
}
