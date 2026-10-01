class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int target_number=0;

        for(int x:hours)
        {
            if(x>=target)
            {
                target_number+=1;
            }
        }
        return target_number;
    }
}