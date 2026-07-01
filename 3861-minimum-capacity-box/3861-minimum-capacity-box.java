class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int n = capacity.length;
        int ans = -1;
        int minimumcap = Integer.MAX_VALUE;

        for(int i = 0;i<n;i++){
            if(capacity[i]>=itemSize && capacity[i]<minimumcap){
                minimumcap=capacity[i];
                ans=i;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna