class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> ls = new ArrayList<>();
        int max=candies[0];
        int len = candies.length;

        for(int i=1;i<len;i++)
        {
           int x = candies[i];
           max=Math.max(x,max);
        }
       
       
        for(int i=0;i<len;i++)
        {
           if(candies[i] + extraCandies>=max)
           {
             ls.add(true);
           }
           else{
             ls.add(false);
           }
        }
       
         return ls;

    }
}