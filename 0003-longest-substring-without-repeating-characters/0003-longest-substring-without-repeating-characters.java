class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character,Integer> hs = new HashMap<>();
        int max=0,j=0,i=0;

        while(j < s.length())
        {
            char c = s.charAt(j);

            if(hs.getOrDefault(c, 0) > 0)
            {
                char d=s.charAt(i);
                hs.put(d,hs.get(d) - 1);
                i++;
            }
            else
            {
                hs.put(c, hs.getOrDefault(c, 0) + 1);
                max = Math.max(max, j - i + 1);
                j++;
            }
        }

        return max;
    }
}