class Solution {
    public int[] numberGame(int[] nums) {
        
     Arrays.sort(nums);
     int len = nums.length-1;

     for(int i=1;i<=len;)
     {
     int temp=nums[i-1];
nums[i-1]=nums[i];
nums[i]=temp;
i=i+2;
     }   

     return nums;
    }
}