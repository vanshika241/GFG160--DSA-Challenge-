class Solution {
    String findLargest(int[] arr) {
        // code here
        int n = arr.length;
        String newStr[] = new String[n];
        for(int i=0;i<n;i++){
            newStr[i] = String.valueOf(arr[i]);
        }
        
        Arrays.sort(newStr, (a,b)->(b+a).compareTo(a+b));
        
        if(newStr[0].equals("0"))return "0";
          StringBuilder ans = new StringBuilder("");
        for(String s : newStr){
            ans.append(s);
        }
        return ans.toString();
        
        
        // int n = arr.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         String s1 = arr[i]+""+arr[j];
        //         String s2 = arr[j]+""+arr[i];
                
        //         if(s1.compareTo(s2)<0){
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
                
        //     }
        // }
        
        // StringBuilder ans = new StringBuilder("");
        // for(int num : arr){
        //     ans.append(num);
        // }
        // if(ans.charAt(0) == '0')return "0";
        // return ans.toString();
    }
}
