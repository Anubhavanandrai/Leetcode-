class Solution {

    public int[] Merge(int[] arr1, int[] arr2)
    {
        int x = arr1.length + arr2.length;
        int[] arr3 = new int[x];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i] <= arr2[j])
            {
                arr3[k] = arr1[i];
                i++;
            }
            else
            {
                arr3[k] = arr2[j];
                j++;
            }

            k++;
        }

        while(i < arr1.length)
        {
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        while(j < arr2.length)
        {
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        return arr3;
    }

    public int[] sortArray(int[] nums)
    {
        if(nums.length <= 1)
        {
            return nums;
        }

        int mid = nums.length / 2;

        int[] arr1 = new int[mid];
        int[] arr2 = new int[nums.length - mid];

        for(int i = 0; i < mid; i++)
        {
            arr1[i] = nums[i];
        }

        for(int i = mid; i < nums.length; i++)
        {
            arr2[i - mid] = nums[i];
        }

        int[] a = sortArray(arr1);
        int[] b = sortArray(arr2);

        return Merge(a, b);
    }
}