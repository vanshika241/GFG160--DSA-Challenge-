class Solution {
    int longestPrefixSuffix(String s) {
        // code here
        int lps[]= new int[s.length()];
        int i=0;
        int pre = 0;
        int suff = 1;
        while(suff < s.length()){
            if(s.charAt(pre) == s.charAt(suff)){
                lps[suff] = pre+1;
                pre++;
                suff++;
                
            }
            else{
                if(pre == 0){
                    lps[suff] = 0;
                    suff++;
                }
                else{
                  pre = lps[pre-1];
                }
            }
            
        }
        return lps[lps.length-1];
    }
}
