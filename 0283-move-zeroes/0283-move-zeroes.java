class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        // fix this
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0; i<n; i++) {
            if(nums[i] != 0) {
                temp.add(nums[i]);
            }
        }
        // Copy non-zero elements back to nums
        for(int i=0; i<temp.size(); i++) {
            nums[i] = temp.get(i);
        }
        // Fill remaining positions with zeros
        for(int i=temp.size(); i<n; i++) {
            nums[i] = 0;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna