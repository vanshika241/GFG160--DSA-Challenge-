class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    
    public int minKadanes(int arr[]){
        int sum =0;
        int minSum = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            sum = Math.min(sum+arr[i],arr[i]);
            minSum = Math.min(minSum,sum);
            
        }
        return minSum;
    }
    
    public int maxKadanes(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = Math.max(sum+arr[i],arr[i]);
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
    public int circularSubarraySum(int arr[]) {

        // Your code here
        int totalSum = 0;
        for(int num:arr)totalSum +=num;
        int minSum = minKadanes(arr);
        int maxSum = maxKadanes(arr);
        int cirSum = totalSum-minSum;
        if(maxSum>0){
            return Math.max(maxSum, cirSum);
        }
        return maxSum;
        
    }
}
