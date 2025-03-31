class Solution {
    // Function to check if two strings are rotations of each other or not.
    public static int[] getLPS(String pat){
        int lps[] = new int[pat.length()];
        int pre = 0;
        int suff = 1;
        while(suff<pat.length()){
            if(pat.charAt(pre) == pat.charAt(suff)){
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
        return lps;
    }
    
    public static boolean kmpAlgo(String text, String pat){
        int first = 0;
        int second = 0;
        int lps[]=getLPS(pat);
        while(first<text.length() && second<pat.length()){
            if(text.charAt(first) == pat.charAt(second)){
                first++;
                second++;
                if(second == pat.length())return true;
            }
            else{
                if(second == 0){
                    first++;
                }
                else{
                    second = lps[second-1];
                }
            }
        }
        return false;
    }
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        if(s1.length() != s2.length())return false;
        String txt = s1+s1;
        return kmpAlgo(txt,s2);
        
    }
}
