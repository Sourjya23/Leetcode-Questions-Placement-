class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        //take nums[i] input
        for(int i =0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(j!=i && nums[j]<nums[i]){
                    count++;
                }
            }
            result[i]=count;
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna