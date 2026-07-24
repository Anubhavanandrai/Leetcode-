class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
      int len= nums.length;
      while(j<len)
      {
        //duplicate element then increase pointer
        if(nums[i]==nums[j])
          {
             j++;
          }    
        else
          {
            if(j==i+1)
             {
                //consecutive elements nothing just movee forward
                i++;
                j++;
             }
            else
             {
                //we wont do swap here because swapping will put visited element also for comparison again
                i++;
                nums[i] = nums[j];
                j++;
             }
           }     
      }
//because we are starting from i=0;      
return i+1;
    }
}