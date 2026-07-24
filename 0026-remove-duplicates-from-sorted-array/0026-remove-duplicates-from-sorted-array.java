class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
      int len= nums.length;
      while(j<len)
      {
        if(nums[i]==nums[j])
          {
             j++;
          }    
        else
          {
            if(j==i+1)
             {
                i++;
                j++;
             }
            else
             {
                i++;
                nums[i] = nums[j];
                j++;
             }
           }     
      }
return i+1;
    }
}