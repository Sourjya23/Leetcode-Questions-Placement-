class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int left = 0;

        for(int right=1;right<n;right++){
            if(nums[left]!=nums[right]){
                nums[left+1]=nums[right];
                left++;
            }
        }
        return left+1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna