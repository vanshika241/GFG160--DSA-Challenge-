class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0])); // by first element of row - start
         List<int[]> mergeFinal = new ArrayList<>();
         int[] current = arr[0];
         mergeFinal.add(current);
         for(int[] interval : arr){
             int currEnd = current[1];
             int nextStart = interval[0];
             int nextEnd = interval[1];
             if(nextStart<=currEnd){
                 //interval can merge
                 current[1] = Math.max(current[1],nextEnd);
             }
             else{
                 //no merging - add in final array 
                 current = interval;
                 mergeFinal.add(current);
             }
         }
         return mergeFinal;
    }
}
