class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int goodpaircount=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(i<j && nums[i]==nums[j]){
                    goodpaircount++;
                }
            }
        }
        return goodpaircount;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna