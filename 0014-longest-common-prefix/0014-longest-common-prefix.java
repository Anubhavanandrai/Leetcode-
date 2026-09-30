//Here my intution was if i sort the array then strings will be lexicographyically sorted means one starting with a will be first and with z at last.So the first will be toatlly different from last and this is how we will start comparing chaacter by character


class Solution {
    public String longestCommonPrefix(String[] strs) {
           StringBuilder sb= new StringBuilder();
     
       if(strs.length<1)
       {
        return sb.toString();
       }
         if(strs.length==1)
       {
        sb.append(strs[0]);
        return sb.toString();
       }
       Arrays.sort(strs);
       String s=strs[0];
       String st=strs[strs.length-1];

       int s1=s.length();
       int s2=st.length();
       int i=0;
  

       while(i<s1 && i<s2)
       {
         if(s.charAt(i)!=st.charAt(i))
         {
              return sb.toString();
         }
         else{
            sb.append(s.charAt(i));
            i++;
         }
       }

       return sb.toString();
      
           
        }
    }
