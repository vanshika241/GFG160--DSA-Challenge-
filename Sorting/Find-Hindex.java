class Solution {
    // Function to find hIndex
    public int hIndex(int[] citations) {
        // code here
        Arrays.sort(citations);
        for(int i=0;i<citations.length;i++){
            int width = citations[i];
            int height = citations.length-i;
            if(width>=height){
                return height;
            }
        }
        return 0;
    }
}
