class Solution {

    HashMap<Integer,Integer> hs = new HashMap<>();
    public int climbStairs(int n) {
        
        if(n==0)
        {
            return 0;
        }
        if(n<=2)
        {
           return n;
        }
  if (hs.containsKey(n)) {
            return hs.get(n);
        }
        
       int count= climbStairs(n-1)+climbStairs(n-2);
       hs.put(n,count);
       return count;
    }
}