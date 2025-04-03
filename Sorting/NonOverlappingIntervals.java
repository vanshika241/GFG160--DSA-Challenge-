class Solution {
    static int minRemoval(int intervals[][]) {
        // code here
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int cnt = 0;
        int lastEnd = Integer.MIN_VALUE;
        for(int interval[]:intervals){
            if(interval[0]>=lastEnd){
                //no merge happening
                lastEnd = interval[1];
            }
            else{
                cnt++;
            }
        }
        return cnt;
    }
}
