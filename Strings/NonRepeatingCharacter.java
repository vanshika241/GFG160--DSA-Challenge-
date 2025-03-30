class Solution {
    static char nonRepeatingChar(String s) {
        // code here
        int freq[] = new int[26];
        for(int i=0;i<s.length();i++){
            int ch1 = s.charAt(i)-'a';
            freq[ch1]++;
        }
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(freq[ch-'a'] == 1)return ch;
        }
        return '$';
    }
}
