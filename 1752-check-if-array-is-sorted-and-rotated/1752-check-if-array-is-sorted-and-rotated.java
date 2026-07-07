class Solution {
    public boolean check(int[] nums) {
       int n = nums.length;

       for(int k=0;k<n;k++){
        boolean sorted = true;

        for(int i=0;i<n-1;i++){
            int curr = nums[(i+k)%n];
            int next = nums[(i+k+1)%n];

            if(curr>next){
                sorted=false;
                break;
            }
        }
        if(sorted){
            return true;
        }
       } 
       return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna