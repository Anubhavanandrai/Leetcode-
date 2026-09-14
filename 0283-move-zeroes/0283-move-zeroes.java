class Solution {
    public void moveZeroes(int[] nums) {
        
    int len = nums.length-1;
     int pass=0;
    for(int i=len;i>=0;i--)
    {
        if(nums[i]==0)
        {
          while(i<len-pass)
          {
            int temp =nums[i+1];
            nums[i+1]=nums[i];
            nums[i]=temp;
            i++;
          }
          pass++;
        }
    }
    }
}