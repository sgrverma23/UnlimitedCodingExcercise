public class SmallestWithGivenNumericValue {
    public static void main(String[] args) {
        System.out.println(getSmallestString(3,27));
    }

    static String getSmallestString(int n, int k) {
        // our ans string
        StringBuilder ans = new StringBuilder();

        // iterating through every position
        for(int i=1; i<=n; i++)
        {
            // we iterate lexicographically, to
            // get the lowest possible value
            for(char c = 'a'; c <= 'z'; c++)
            {
                // getting the value 1-based and
                // calculating remaining 'k'
                int val = c - 'a' + 1;
                int rem = k-val;

                // this is the condition to check
                // whether we can add the character or not
                if(rem <= (n-i)*26)
                {
                    ans.append(c);
                    k -= val;   // updating the 'k'
                    break;
                }
            }
        }
        return ans.toString();
    }

}
