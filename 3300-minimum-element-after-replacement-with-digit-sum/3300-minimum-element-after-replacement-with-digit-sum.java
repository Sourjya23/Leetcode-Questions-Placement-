class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int min_elem=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int num =nums[i];
            int sum =0;

            while(num>0){
            int digit = num%10;
            sum+=digit;
            num/=10;
            }
            min_elem = Math.min(min_elem,sum);
        }

         return min_elem;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna