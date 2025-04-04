class Solution {
    static boolean canAttend(int[][] arr) {
        // Your code here
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        int curr[] = arr[0];
        for(int i=1;i<arr.length;i++){
            int currEnd = curr[1];
            int nextStart = arr[i][0];
            if(nextStart<currEnd){
                return false;
            }
           
                curr = arr[i];
            
        }
        return true;
    }
}
