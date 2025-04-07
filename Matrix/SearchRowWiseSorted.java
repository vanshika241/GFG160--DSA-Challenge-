class Solution {
    // Function to search a given number in row-column sorted matrix.
    
    public boolean binarySearch(int arr[], int x){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid] == x){
                return true;
            }
            else if(arr[mid]>x){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
    public boolean searchRowMatrix(int[][] mat, int x) {
        // code here
        for(int i=0;i<mat.length;i++){
            if(binarySearch(mat[i],x) == true){
                return true;
            }
        }
        return false;
    }
}
