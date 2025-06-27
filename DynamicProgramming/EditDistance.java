class Solution {
    public int editRec(int i,int j,String s1, String s2){
        if(i==0)return j;
        if(j==0)return i;
        
        if(s1.charAt(i-1) == s2.charAt(j-1)){
            return editRec(i-1,j-1,s1,s2);
        }
        
        return 1+Math.min(editRec(i,j-1,s1,s2),Math.min(editRec(i-1,j-1,s1,s2),editRec(i-1,j,s1,s2)));
    }
    public int editDistance(String s1, String s2) {
        // Code here
        int n1 = s1.length();
        int n2 = s2.length();
        int dp[][] = new int[n1+1][n2+1];
        for(int i=0;i<n1+1;i++){
            dp[i][0] = i;
        }
        for(int j=0;j<n2+1;j++){
            dp[0][j] = j;
        }
        
        for(int i=1;i<n1+1;i++){
            for(int j=1;j<n2+1;j++){
              if(s1.charAt(i-1) == s2.charAt(j-1)){
                dp[i][j] = dp[i-1][j-1];
              }  
              else{
                  dp[i][j] = 1+Math.min(dp[i-1][j],Math.min(dp[i-1][j-1] , dp[i][j-1] ));
              }
            }
        }
        
        return dp[n1][n2];
        
        
    }
}
