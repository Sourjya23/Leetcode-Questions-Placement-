class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int element = 0;
        int cnt=0;

        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt=1;
                element=nums[i];
            }else if(element==nums[i]){
                cnt++;
            }else{
                cnt--;
            }
        }
        int fcnt=0;
        for(int i=0;i<n;i++){
            if(nums[i]==element){
                fcnt++;
            }
        }
        if(fcnt>n/2){
                return element;
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna