class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        StringBuilder ans = new StringBuilder("");
        int i=s1.length()-1;
        int j=s2.length()-1;
        int carry = 0;
        while(i>=0||j>=0|| carry>0){
            int num1 = (i>=0)?s1.charAt(i)-'0':0;
            int num2 = (j>=0)?s2.charAt(j)-'0':0;
            
            int sum = num1+num2+carry;
            carry = sum/2;
            ans.append(sum%2);
            i--;
            j--;
        }
        while(ans.length()>1 && ans.charAt(ans.length()-1) == '0'){
            ans.setLength(ans.length()-1);
        }
        return ans.reverse().toString();
    }
}
