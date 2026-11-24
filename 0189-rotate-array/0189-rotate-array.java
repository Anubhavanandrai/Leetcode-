class Solution {

    static void rotateRight(int[] a,int start,int end)
    {
       while(start<end)
       {
         int temp=a[start];
         a[start]=a[end];
         a[end]=temp;
         start++;
         end--;
       }
    }

    public void rotate(int[] nums, int k) {

      int rotate = k%nums.length;
      
      rotateRight(nums,nums.length - rotate,nums.length-1);
      rotateRight(nums,0,nums.length - rotate-1);
      rotateRight(nums,0,nums.length-1);

    }
}