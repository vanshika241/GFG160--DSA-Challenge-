class Solution {
    public static int[] getLPS(String pat){
        int lps[] = new int[pat.length()];
        int pre = 0;
        int suff = 1;
        while(suff<pat.length()){
            if(pat.charAt(pre) ==pat.charAt(suff) ){
                lps[suff] = pre+1;
                pre++;
                suff++;
            }
            else{
                if(pre == 0){
                    lps[suff]  =0;
                    suff++;
                }
                else{
                    pre = lps[pre-1];
                }
            }
        }
        return lps;
    }
    public static int minChar(String s) {
        // Write your code here
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        String newString = s+"#"+sb.toString();
        int lps[] = getLPS(newString);
        return n-lps[newString.length()-1];
    }
}
