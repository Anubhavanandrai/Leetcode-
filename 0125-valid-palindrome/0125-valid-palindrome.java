// class Solution {
//     public boolean isPalindrome(String s) {
        
//      String[] str= s.split("[ ,:]");   

//      StringBuilder sb = new StringBuilder();
     
//      for(String k:str)
//      {
//         String t=k.toLowerCase();
//          sb.append(t);
//      }

//      System.out.println(sb + " ");

//      int len= sb.length();
//      int i=0,j=len-1;

//      while(i<=j)
//      {
//         if(sb.charAt(i)!=sb.charAt(j))
//         {
//            return false;
//         }
//         i++;j--;
//      }
   
//    return true;
//     }
// }

class Solution {
    public boolean isPalindrome(String s) {

//replaceAll(what to replace , with what)

// ^ is not
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
