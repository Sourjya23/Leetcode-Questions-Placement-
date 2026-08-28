class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }
        int sum = 0,maxLength=0;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);// sum =0, pos=-1

        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(map.containsKey(sum)){
                int end = map.get(sum);
                maxLength=Math.max(maxLength,i-end);
            }else{
                map.put(sum,i);
            }
        }
        return maxLength;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna