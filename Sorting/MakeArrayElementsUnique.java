class Solution {
    public int minIncrements(int[] arr) {
        // Code here
        Arrays.sort(arr);
        int cnt = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] <= arr[i-1]){
                cnt +=( arr[i-1]+1)-arr[i];
                arr[i] = arr[i-1]+1;
                
            }
        }
        return cnt;
    }
}
