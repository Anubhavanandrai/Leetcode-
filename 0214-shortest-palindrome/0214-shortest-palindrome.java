class Solution {
    public String shortestPalindrome(String s) {

        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();

        String str = s + "$" + reverse;

        int[] lps = new int[str.length()];

        int i = 0;
        int j = 1;

        while (j < str.length()) {

            if (str.charAt(i) == str.charAt(j)) {
                i++;
                lps[j] = i;
                j++;
            } 
            else {

                if (i == 0) {
                    lps[j] = 0;
                    j++;
                } 
                else {
                    i = lps[i - 1];
                }
            }
        }

        int longestPalPrefix = lps[str.length() - 1];

        String remaining = s.substring(longestPalPrefix);

        StringBuilder add = new StringBuilder(remaining);
        add.reverse();

        return add.toString() + s;
    }
}