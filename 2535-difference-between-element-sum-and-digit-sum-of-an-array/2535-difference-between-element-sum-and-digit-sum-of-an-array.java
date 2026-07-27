class Solution {
    public int differenceOfSum(int[] nums) {
        int n = nums.length;
        int elemsum=0,digitsum=0;
        for(int num:nums){
            elemsum+=num;

            while(num>0){
            int digit = num%10;
            digitsum+=digit;
            num/=10;
            }
        }

        int difference = Math.abs(elemsum-digitsum);
        return difference;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna