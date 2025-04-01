class Solution {
    // Function to sort an array of 0s, 1s, and 2s
   
    public void sort012(int[] arr) {
        // code here
       int n = arr.length;
       int i=0;
       int j=0;
       int k = n-1;
       while(j<=k){
           if(arr[j] == 0){
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               j++;
               i++;
           }
           else if(arr[j] == 1){
               j++;
           }
           else{
               int temp = arr[j];
               arr[j] = arr[k];
               arr[k] = temp;
               k--;
           }
       }
    }
}
