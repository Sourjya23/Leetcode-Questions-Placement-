class Solution {
    public int singleNumber(int[] nums) {
        // 3 total approaches. first i and j niye korse...
        // 2nd ta hoilo map niye korse O(n/2+1) Tc
        // 3rd one xor 

        int n = nums.length;
        int xorr = 0;
        for(int i=0;i<n;i++){
            xorr = xorr^nums[i];
        }
        return xorr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna