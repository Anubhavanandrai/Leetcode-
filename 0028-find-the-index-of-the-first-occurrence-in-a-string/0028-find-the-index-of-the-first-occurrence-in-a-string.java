class Solution {

    public int strStr(String haystack, String needle) {

        int pat = needle.length();

        if (pat == 0) {
            return 0;
        }

        int[] lps = new int[pat];

        int i = 0;
        int j = 1;

        while (j < pat) {

            if (needle.charAt(i) == needle.charAt(j)) {
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

        int first = 0;
        int second = 0;

        while (first < haystack.length()) {

            if (haystack.charAt(first) == needle.charAt(second)) {

                first++;
                second++;

                if (second == pat) {
                    return first - pat;
                }
            }
            else {

                if (second == 0) {
                    first++;
                }
                else {
                    second = lps[second - 1];
                }
            }
        }

        return -1;
    }
}