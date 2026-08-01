class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> answer = new HashSet<>();
        HashSet<Integer> lookup = new HashSet<>();
        for(int num:nums1){
            lookup.add(num);
        }
        for(int num:nums2){
            if(lookup.contains(num)){
                answer.add(num);
            }
        }
        int[] result= new int[answer.size()];
        int i=0;
        
        for(int num:answer){
            result[i++]=num;
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna