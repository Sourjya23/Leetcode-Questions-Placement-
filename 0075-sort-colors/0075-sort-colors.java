class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0, mid =0, high = n-1;

        while(mid<=high){
            if(nums[mid]==0){
                Swap(nums,low,mid);
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                Swap(nums,mid,high);
                high--;
            }
        }
    }
    private void Swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna