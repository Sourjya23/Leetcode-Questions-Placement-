class Solution {
    public int totalMoney(int n) {
        int result = 0;

        int monday_money = 1; //1dollar

        while(n > 0) {

            int money = monday_money; //1
            for(int day = 1; day <= Math.min(n, 7); day++) {
                result += money;
                money++;
            }

            n -= 7;
            monday_money++;
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna