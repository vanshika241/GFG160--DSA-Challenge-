class Solution {
    
    public void reverse(int arr[], int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    void nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
        //Step 1 find pivot
        int pivot = -1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot == -1){
            reverse(arr,0,n-1);
            return;
        }
        //find first largest 
        for(int i=n-1;i>=pivot;i--){
            if(arr[i] > arr[pivot]){
                //swap
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
                break;
            }
        }
        reverse(arr,pivot+1,n-1);
    }
}
