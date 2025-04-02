class Solution {
    // Function to count inversions in the array.
    static int merge(int arr[], int left, int mid,int right){
        int count = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        int i = left; // first part
        int j = mid+1; // second part
        while(i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else{
                count += mid-i+1;
                temp.add(arr[j]);
                j++;
            }
        }
        
        //remaining elements 
        while(i<=mid){
             temp.add(arr[i]);
                i++;
        }
        
        while(j<=right){
            temp.add(arr[j]);
                j++;
        }
        
        for(int k =left;k<=right;k++){
            arr[k] = temp.get(k-left);
        }
        return count;
    }
    
    
    static int mergeSort(int arr[], int left, int right){
        
        if(left>=right)return 0; // single element ho gya
        int mid = left+(right-left)/2; // to reduce integer overflow
        int count = 0;
       count += mergeSort(arr, left, mid);
       count +=  mergeSort(arr, mid+1, right);
       
       count += merge(arr,left,mid,right);
        return count;
        
    }
    static int inversionCount(int arr[]) {
        // Your Code Here
         return mergeSort(arr,0,arr.length-1);
    }
}
