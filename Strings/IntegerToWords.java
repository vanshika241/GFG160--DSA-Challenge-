class Solution {
    public static String[] units ={
        "","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"
    };
     public static String[] tens ={
        "","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"
    };
    
    public static String[] multiplier={
        "","Thousand","Million","Billion"
    };
    
    String convertToWords(int n) {
        // code here
        if(n == 0)return "Zero";
        String res = "";
        int i=0;
        while(n>0){
            if(n%1000 != 0){
                int value = n%1000;
                String temp = "";
                if(value >=100){
                    temp = units[value/100]+" Hundred ";
                    value %=100;
                }
                 if(value >=20){
                    temp += tens[value/10]+" ";
                    value %=10;
                }
                
                if(value >0){
                    temp += units[value]+" ";
                }
                
                temp  += multiplier[i] +" ";
                res = temp+res;
                
                
            }
            n /=1000;
            i++;
        }
        return res.trim();
    }
}
