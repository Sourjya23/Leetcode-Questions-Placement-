class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0)return 0;
        HashSet<Integer> answer = new HashSet<>();
        int longest =1;
        for(int num:nums){
            answer.add(num);
        }
        for(int num1:answer){
                if(!answer.contains(num1-1)){
                int number = num1;
                int cnt=1;
                    while(answer.contains(number+1)){
                    number++;
                    cnt++;
                    }
                    longest = Math.max(longest,cnt);
                }
            }
        return longest;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna