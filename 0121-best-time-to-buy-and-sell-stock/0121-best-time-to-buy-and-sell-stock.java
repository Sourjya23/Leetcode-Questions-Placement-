class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit=0;
        int mini=prices[0];

        for(int i =0;i<n;i++){
            int cost = prices[i]-mini;
            maxProfit=Math.max(maxProfit,cost);
            mini=Math.min(mini,prices[i]);
        }

        return maxProfit;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna