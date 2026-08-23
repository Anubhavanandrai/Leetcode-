class Solution {
    public boolean isAnagram(String s, String t) {
        
       if(s.length()!=t.length())
       {
        return false;
       }

       HashMap<Character,Integer> hs = new HashMap<>();


       for(char c : s.toCharArray())
       {
         hs.put(c,hs.getOrDefault(c,0)+1);
       }
       for(char c: t.toCharArray())
       {  
        //here hs.get(c) is wrong because this will return a value which wll be of Integer type which is  a object and we are comparing Object with Number i.e hs.get(c) <=0

        //Instead if you dont find anything means you are ultimately going to return null so nstead return Default value i.e 0
       // and that is a number which we can compare
        if(hs.getOrDefault(c,0)<=0)
        {
          return false;
        }
         hs.put(c,hs.getOrDefault(c,0)-1);
       }

     return true;

    }
}