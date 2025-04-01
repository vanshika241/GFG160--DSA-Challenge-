class Solution {
    public List<String> camelCase(String[] arr, String pat) {
        // code here
        List<String> ans = new ArrayList<>();
        for(String text:arr){
            int first =0;
            int second = 0;
            while(first<text.length()&&second<pat.length()){
                if(Character.isLowerCase(text.charAt(first))){
                    first++;
                }
                else if(text.charAt(first) != pat.charAt(second)){
                    break;
                }
                else{
                    first++;
                    second++;
                }
            }
          if(second == pat.length())ans.add(text);
            }
           return ans; 
        }
        
    
}
