class Solution {
    static int lcsRec(int idx1, int idx2,String s1, String s2, int dp[][]){
        if(idx1<0 || idx2<0)return 0;
        if(dp[idx1][idx2] != -1)return dp[idx1][idx2];
        if(s1.charAt(idx1) == s2.charAt(idx2)){
            return 1+lcsRec(idx1-1,idx2-1,s1,s2,dp);
            
        }
        int take1 = lcsRec(idx1-1,idx2,s1,s2,dp);
        int take2 = lcsRec(idx1,idx2-1,s1,s2,dp);
        return  dp[idx1][idx2] = Math.max(take1,take2);
    }
    static int lcs(String s1, String s2) {
        // code here
        int n1 = s1.length();
        int n2 = s2.length();
        int dp[][] = new int[n1+1][n2+1];
        for(int i=1;i<n1+1;i++){
            for(int j=1;j<n2+1;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    int take1 = dp[i-1][j];
                    int take2 = dp[i][j-1];
                    dp[i][j] = Math.max(take1,take2);
                }
            }
        }
        return dp[n1][n2];
        // for(int i=0;i<n1;i++){
        //     for(int j=0;j<n2;j++){
        //         dp[i][j] = -1;
        //     }
        // }
        // return lcsRec(n1-1,n2-1,s1,s2,dp);
    }
}
