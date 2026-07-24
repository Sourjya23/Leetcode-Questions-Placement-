class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        
        //store character frequencies
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            freq.put(ch,freq.getOrDefault(ch,0)+1);
            if(freq.get(s.charAt(i))==2){
                return s.charAt(i);
            }
        }
        // //check condition and return
        // for(int i=0;i<s.length();i++){
        //     if(freq.get(s.charAt(i))==2){
        //         return s.charAt(i);
        //     }
        // }
        return '0';
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna