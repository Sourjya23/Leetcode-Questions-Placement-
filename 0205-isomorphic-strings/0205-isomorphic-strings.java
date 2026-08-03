class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character, Character> first = new HashMap<>();
        HashMap<Character, Character> second = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            char c1 = t.charAt(i);

            if(first.containsKey(c)){
                if(first.get(c)!=c1){
                    return false;
                }
            }else{
                first.put(c,c1);
            }
        }

        //second
        for(int i=0;i<t.length();i++){
            char c = s.charAt(i);
            char c1 = t.charAt(i);

            if(second.containsKey(c1)){
                if(second.get(c1)!=c){
                    return false;
                }
            }else{
                second.put(c1,c);
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna