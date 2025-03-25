class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int maxProfit = 0;
        int min = prices[0];
        int n = prices.length;
        for(int i=1;i<n;i++){
            int cost = prices[i]-min;
            maxProfit = Math.max(maxProfit,cost);
            min = Math.min(min,prices[i]);
        }
        return maxProfit;
    }
}
