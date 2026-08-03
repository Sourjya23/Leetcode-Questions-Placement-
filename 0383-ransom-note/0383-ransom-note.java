class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> freq = new HashMap<>();

        //collect frequencies for magazine.
        for(char ch: magazine.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }

        //akhon check marao ransom er bhitre 
        for(char ch:ransomNote.toCharArray()){
            if(!freq.containsKey(ch) || freq.get(ch)==0){
                return false;
            }
            freq.put(ch,freq.get(ch)-1);
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna