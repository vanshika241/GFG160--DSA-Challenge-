class Solution {
    String minSum(int[] arr) {
        // code here
        Arrays.sort(arr);
        StringBuilder num1 = new StringBuilder("");
         StringBuilder num2 = new StringBuilder("");
        for(int i=0;i<arr.length;i++){
           if(i%2 ==0){
               num1.append(arr[i]);
           }
           else{
               num2.append(arr[i]);
           }
        }
        
        StringBuilder res = new StringBuilder("");
        int carry = 0;
        int i= num1.length()-1;
        int j = num2.length()-1;
        while(i>=0 || j>=0 ||carry>0){
            int dig1 = (i>=0)?num1.charAt(i)-'0':0;
             int dig2 = (j>=0)?num2.charAt(j)-'0':0;
             int sum = dig1+dig2+carry;
             if(sum>0)res.append(sum%10);
             carry = sum/10;
             i--;
             j--;
            
        }
        return res.reverse().toString();
    }
}
