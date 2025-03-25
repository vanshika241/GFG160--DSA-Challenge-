class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        int prefix = 1;
        int suffix = 1;
        int maxProduct = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(prefix == 0)prefix = 1;
            if(suffix == 0)suffix = 1;
            prefix *= arr[i];
            suffix *= arr[n-1-i];
            maxProduct = Math.max(maxProduct,Math.max(prefix,suffix));
        }
        return maxProduct;
    }
}
