class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int targetidx = -1;

        for(int i =n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                targetidx=i-1;
                break;
            }
        }
        if(targetidx!=-1){
            int swapidx=targetidx;

            for(int j=n-1;j>=targetidx;j--){
                if(nums[j]>nums[targetidx]){
                    swapidx=j;
                    break;
                }
            }
            int temp = nums[targetidx];
            nums[targetidx]=nums[swapidx];
            nums[swapidx]=temp;
        }

        int left = targetidx+1;
        int right = n-1;

        while(left<right){
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;

            left++;
            right--;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna