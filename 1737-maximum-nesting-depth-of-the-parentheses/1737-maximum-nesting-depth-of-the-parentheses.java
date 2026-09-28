class Solution {
    public int maxDepth(String s) {
        
        Stack<Character> st= new Stack<>();

        char[] ch=s.toCharArray();
        int max=0,sum=0;

        for(char c: ch)
        {
            if(c=='(')
            {
               st.push(c);
               sum+=1;
               max=Math.max(max,sum);
            }
            else if (c==')')
            {
                st.pop();
                sum=sum-1;
            }
        }
        return max;
    }
}