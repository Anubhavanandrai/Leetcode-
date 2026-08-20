class Solution {
    public int missingNumber(int[] nums) {

    int len = nums.length;

    int sum =  (len*(len+1))/2;       
    int arrsum =0;

    for(int i=0;i<=len -1;i++)
    {
        arrsum +=nums[i]; 
    }
    
      int diff = sum - arrsum;
      return diff;
    }
}