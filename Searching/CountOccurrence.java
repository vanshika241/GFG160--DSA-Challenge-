
class Solution {
    
    int firstOcc(int[] arr, int target){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                ans = mid;
                end = mid-1;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
    
     int lastOcc(int[] arr, int target){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                ans = mid;
               start = mid+1;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
    int countFreq(int[] arr, int target) {
        // code here
        int ans1 = firstOcc(arr,target);
        int ans2 = lastOcc(arr,target);
        if(ans1 == -1 || ans2 == -1){
            return 0;
        }
        return ans2-ans1+1;
    }
}
