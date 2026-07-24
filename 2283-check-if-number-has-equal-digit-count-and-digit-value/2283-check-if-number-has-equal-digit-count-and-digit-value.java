class Solution {
    public boolean digitCount(String num) {
        HashMap<Character,Integer> freq = new HashMap<>();
        //store frequency of numbers
        for(int i=0;i<num.length();i++){
            char ch = num.charAt(i);

            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<num.length();i++){
            char digit =(char) ('0'+i);

            int actual = freq.getOrDefault(digit,0);
            int expected = num.charAt(i)-'0';

            if(actual!=expected){
                return false;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna