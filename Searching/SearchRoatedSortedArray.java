class Solution {
    int minIndex(int arr[]){
        int start = 0;
        int end = arr.length-1;
        int n = arr.length;
        while(start<=end){
            if(arr[start]<=arr[end]){
                return start;
            }
            int mid = start+(end-start)/2;
            int prev = (mid+n-1)%n;
            int next = (mid+1)%n;
            if(arr[mid]<=arr[prev] && arr[mid]<=arr[next]){
                return mid;
            }
            if(arr[start] <=arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    int binarySearch(int arr[], int start, int end,int key){
        while(start<=end){
            int mid = start+(end-start)/2;
           
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid] <key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    int search(int[] arr, int key) {
        // Complete this function
        int n = arr.length;
        int minIdx = minIndex(arr);
        if(key >=arr[minIdx] && key <=arr[n-1]){
            return binarySearch(arr,minIdx,n-1,key);
        }
        else{
        return binarySearch(arr,0,minIdx-1,key);
        }
      
    }
}
