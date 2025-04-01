
class Solution {
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
        int lps[] = getLPS(pat);
        int first = 0;
        int second = 0;
        while(first<text.length()){
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
    static int minRepeats(String s1, String s2) {
        // code here
        StringBuilder temp = new StringBuilder(s1);
        int count = 1;
        
        while(temp.length()<s2.length()){
            temp.append(s1);
            count++;
            
        }
        
        if(kmpAlgo(temp.toString(),s2) == true){
                return count;
        }
        temp.append(s1);
        count++;
        if(kmpAlgo(temp.toString(),s2) == true){
                return count;
        }
        return -1;
        
    }
};
