class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character,Integer> hs = new HashMap<>();
        char[] arr =magazine.toCharArray(); 

        for(char c : arr)
        {
           hs.put(c,hs.getOrDefault(c,0)+1);
        }
       
         char[] ar =ransomNote.toCharArray(); 
        for(char c:ar)
        {
            if(!hs.containsKey(c)|| hs.get(c) == 0)
            {
                return false;
            }
            hs.put(c, hs.getOrDefault(c,0) - 1);
        }
       
       return true;

    }
}