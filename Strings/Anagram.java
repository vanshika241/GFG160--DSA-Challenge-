class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
        if(s1.length() != s2.length())return false;
        int idx1 = 0;
        int idx2 = 0;
        int freq[] = new int[26];
        while(idx1<s1.length() && idx2<s1.length()){
            int ch1 = s1.charAt(idx1)-'a';
            freq[ch1]++;
            
            int ch2 = s2.charAt(idx2)-'a';
            freq[ch2]--;
            
            idx1++;
            idx2++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;
    }
}
