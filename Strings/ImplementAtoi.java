class Solution {
    public int myAtoi(String s) {
        // Your code here
        int i=0;
        int sign = 1;//by default +
        s = s.trim();
        int n = s.length();
        long ans = 0;
        
        
        if(n ==0) return 0;
        if(i<n && (s.charAt(i)=='+' ||  s.charAt(i)=='-')){
            sign =  s.charAt(i)=='+'?1:-1;
            i++;
        }
        
         while(i<n && Character.isDigit(s.charAt(i))){
            ans = ans*10 +( s.charAt(i)-'0');
            if(ans*sign > Integer.MAX_VALUE)return Integer.MAX_VALUE;
            if(ans*sign < Integer.MIN_VALUE)return Integer.MIN_VALUE;
            
            i++;
        }
        
        return (int)(sign * ans);
        
    }
}
