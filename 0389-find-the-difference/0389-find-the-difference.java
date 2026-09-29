


class Solution {
    public char findTheDifference(String s, String t) {

        HashMap<Character, Integer> hs = new HashMap<>();

        for(char c : t.toCharArray())
        {
            hs.put(c, hs.getOrDefault(c, 0) + 1);
        }

        for(char c : s.toCharArray())
        {
            hs.put(c, hs.get(c) - 1);
        }

        for(char c : t.toCharArray())
        {
            if(hs.get(c) > 0)
            {
                return c;
            }
        }

        return ' ';
    }
}