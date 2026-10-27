class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int left = 0;
        
        
        for (int right = 0; right < arr.length; right++) {
            
            if (arr[right] % 2 == 0) {
                left = right + 1;
            }
            
           
            if (right - left + 1 == 3) {
                return true;
            }
        }
        
        return false;
    }
}
