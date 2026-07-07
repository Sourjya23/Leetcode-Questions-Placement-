class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor1 = 0;
        int xor2 = 0;

        // Fix: Compute XOR of 1..n and XOR of array in single passes
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }
        for (int num : nums) {
            xor2 ^= num;
        }

        // The missing number is XOR of the two
        return xor1 ^ xor2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna