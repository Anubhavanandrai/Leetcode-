class Solution {
    public boolean isPalindrome(int x) {
        
      int number =0;
      int original=x;
      if(x<0)
      {
        return false;
      }
       while(x>0)
       {
         int digit =x%10; 
         number = number*10 + digit;
         x=x/10;

       } 

       if(original==number)
       {
        return true;
        }
       return false;
    }
}