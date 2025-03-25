class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        int n = arr.length;
        int i=0;
        while(i<n){
            int correctIdx = arr[i]-1;
            if(correctIdx>=0 && correctIdx<n && arr[i] != arr[correctIdx]){
                int temp = arr[i];
                arr[i] = arr[correctIdx];
                arr[correctIdx] = temp;
            }
            else{
                i++;
            }
        }
        
        for(int idx = 0;idx<n;idx++){
            if(arr[idx] != idx+1){
                return idx+1;
            }
        }
        return n+1;
    }
}
