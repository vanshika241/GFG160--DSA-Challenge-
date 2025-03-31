
class Solution {
    
    public static int[] getLPS(String pat){
        int pre = 0;
        int suff = 1;
        int lps[] = new int[pat.length()];
        while(suff<pat.length()){
            if(pat.charAt(pre) == pat.charAt(suff) ){
                lps[suff] = pre+1;
                suff++;
                pre++;
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

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int lps[] = getLPS(pat);
        int first = 0;//txt
        int second = 0;//pat
        while(first<txt.length()){
             if(txt.charAt(first) == pat.charAt(second) ){
                first++;
                second++;
                if(second == pat.length()){
                    ans.add(first-second);
                    second = lps[second-1];
                }
                
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
        return ans;
        
        
    }
}
