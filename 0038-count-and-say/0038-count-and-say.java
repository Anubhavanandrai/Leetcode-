//     Learning:
//        if some operation is left after loop then make a if condition outside
//        recursion always takes care of increment decrement dont use extra variables
//         


class Solution {
 
    public String countAndSay(int n) {

//answer is inside because it is changing everytime when n changes         
   String answer="";
       if(n==1)
       {
         System.out.println("n==1 called");
        return "1";
       } 
       
        System.out.println("n is : "+n);
       String s=countAndSay(n-1);
       int len=s.length();
       int i=0,j=0;

       while(j<=len-1)
       {
        if(s.charAt(i)==s.charAt(j))
        {
            j++;
        }
        else{
            int x=j-i;
            answer=answer+String.valueOf(x)+s.charAt(i); 
            i=j;
            j++;
        }
       }
        if(j==len)
        {
        int x = j - i;
        answer = answer + String.valueOf(x) + s.charAt(i);
        }
       return answer;
    }
}