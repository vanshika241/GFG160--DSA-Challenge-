class Solution {
    public static boolean isValid(int[] arr, int k, int mid){
        int sum = 0;
        int student = 1;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum > mid){
                student++;
                sum = arr[i];
            }
        }
        return student>k?false:true;
    }
    public static int findPages(int[] arr, int k) {
        // code here
        int n = arr.length;
        if(k>n)return -1;
        int start =0;
        int end = 0;
        for(int i=0;i<n;i++){
            start = Math.max(arr[i],start);
            end += arr[i];
        }
        int res = -1;
        while(start <=end){
            int mid = start+(end-start)/2;
            if(isValid(arr,k,mid) == true){
                res = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return res;
    }
}
