class Solution {
    public long maxAlternatingSum(int[] nums) {
        
        int x=nums.length;

        for(int n=0;n<x;n++)
        {
           if(nums[n]<0)
           {
            nums[n]=-1*nums[n];
           }
        }
        Arrays.sort(nums);
        long sum=0;

        if(x%2==0)
        {
          for(int i=x/2;i<x;i++)
          {
            sum=sum+nums[i]*nums[i]; 

          } 
          for(int i=0;i<x/2;i++)
          {
            sum=sum-nums[i]*nums[i]; 

          } 
          return sum;

        }
        else{
            for(int i=x/2;i<x;i++)
          {
            sum=sum+nums[i]*nums[i]; 

          } 
          for(int i=0;i<x/2;i++)
          {
            sum=sum-nums[i]*nums[i]; 

          } 
          return sum;

        }
    }
}