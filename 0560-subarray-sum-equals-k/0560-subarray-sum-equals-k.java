class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        freq.put(0,1);
        int currsum = 0;
        int cnt=0;

        for(int num:nums){
            currsum+=num;

            if(freq.containsKey(currsum-k)){
                cnt+=freq.get(currsum-k);
            }
            freq.put(currsum,freq.getOrDefault(currsum,0)+1);
        }
        return cnt;
    }
}




// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna