class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n = nums.length;

        Arrays.sort(nums);
        ArrayList<Integer> count = new ArrayList<>();
        

        for(int i=0;i<n;i++){
            if(nums[i]==target){
                count.add(i);
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna