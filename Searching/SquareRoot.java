class Solution {
    int floorSqrt(int n) {
        // Your code here
        if(n == 0)return 0;
        int start = 1;
        int end = n;
        int ans = 0;
        while(start<=end){
            int mid = start+(end-start)/2;
            int val = mid*mid;
            if(val<=n){
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return  (int)Math.floor(ans);
    }
}
