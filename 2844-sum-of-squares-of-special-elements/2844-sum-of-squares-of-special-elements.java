class Solution {
    public int sumOfSquares(int[] nums) {
        
        int sum=0;
        int x= nums.length;
      for(int i=1;i<=x;i++)
      {
          if(x%i==0)
          {
            sum=sum+nums[i-1]*nums[i-1];
          }
      } 
      return sum; 
    }
}