class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        int n = arr.length;
      
       int start = 0;
       int end = arr.length-1;
       while(start<=end){
           if(arr[start] <= arr[end]){
               return arr[start];
           }
           int mid = start+(end-start)/2;
           int prev = (mid+n-1)%n;
           int next = (mid+1)%n;
           if(arr[mid] <=arr[prev] && arr[mid]<=arr[next]){
            return arr[mid];
           }
          if(arr[start]<=arr[mid]){
               start = mid+1;
           }
           else{
               end = mid-1;
           }
           
       }
       return -1;
    }
}
