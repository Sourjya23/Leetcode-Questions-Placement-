class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int operations=0;
        for(int i=1;i<n;i++){
            if(nums[i-1]>=nums[i]){
                int old=nums[i];
                nums[i]=nums[i-1]+1;
                operations+=nums[i]-old;
            }
        }
        return operations;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna