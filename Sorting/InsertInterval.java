class Solution {
    static ArrayList<int[]> insertInterval(int[][] arr, int[] newInterval) {
        // code here
        ArrayList<int[]>  mergeFinal = new ArrayList<>();
        int i=0;
        int n = arr.length;
        while(i<n && arr[i][1]<newInterval[0] ){
            mergeFinal.add(arr[i]);
            i++;
        }
        
        while(i<n && arr[i][0]<=newInterval[1]){
            newInterval[0] = Math.min(newInterval[0],arr[i][0]);
            newInterval[1] = Math.max(newInterval[1],arr[i][1]);
            i++;

        }
        mergeFinal.add(newInterval);
        
        while(i<n){
            mergeFinal.add(arr[i]);
            i++;
        }
        
        return mergeFinal;
    }
}
