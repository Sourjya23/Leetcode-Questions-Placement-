class Solution {
    public int findClosestNumber(int[] nums) {
        int n = nums.length;
        int closest=nums[0];
        for(int i=1;i<n;i++){
            if(Math.abs(nums[i])< Math.abs(closest)){
                closest = nums[i];
            }
            else if(Math.abs(nums[i])==Math.abs(closest)){
                closest = Math.max(closest,nums[i]);
            }
        }
        return closest;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna