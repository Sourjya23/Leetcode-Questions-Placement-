class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if(pattern.length()!=words.length){
            return false;
        }

        HashMap<Character,String> CharToWord = new HashMap<>();
        HashSet<String> seenWords = new HashSet<>();

        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            String w = words[i];

            if(CharToWord.containsKey(c)){
                if(!CharToWord.get(c).equals(w)){
                    return false;
                }
            }else{
                if(seenWords.contains(w)){
                    return false;
                }
                CharToWord.put(c,w);
                seenWords.add(w);
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna