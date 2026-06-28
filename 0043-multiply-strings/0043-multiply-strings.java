class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")){
            return "0";
        }

        int n = num1.length();
        int m = num2.length();

        int[] result = new int[n+m];

        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                int digit1=num1.charAt(i)-'0';
                int digit2=num2.charAt(j)-'0';

                int product = digit1*digit2;

                int position2=i+j+1;
                int position1=i+j;

                int sum = product + result[position2];

                result[position2]=sum%10;
                result[position1]+=sum/10; 
            }
        }
        StringBuilder ans = new StringBuilder();
        int i =0;

        while(i<result.length && result[i]==0){
            i++;
        }
        while(i<result.length){
            ans.append(result[i++]);
        }
        return ans.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna