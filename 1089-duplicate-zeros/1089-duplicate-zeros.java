class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int cntzeros=0;
        for(int num:arr){
            if(num==0){
                cntzeros++;
            }
        }
        int left=n-1;
        int right=n+cntzeros-1;
        while(left!=right){
            insert(arr,left,right--);
            if(arr[left]==0){
                insert(arr,left,right--);
            }
            left--;
        }
        }
        private void insert(int[] arr,int left, int right){
            if(right<arr.length){
                arr[right]=arr[left];
            }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna