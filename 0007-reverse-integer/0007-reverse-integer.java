class Solution {
    public int reverse(int x) {

//To Make any negative number as positive alsways do what is done below
       int sign =1;
       long y=x;
       if(y<0)
       {
        sign =-1;
        y= -y;
       }

//chnage it to stringbuffer for doing reverse easily
        String s = String.valueOf(y);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
//change back to integer     
           
        long z = Long.parseLong(sb.toString());
        z = z * sign;
        if (z < Integer.MIN_VALUE || z > Integer.MAX_VALUE) {
            return 0;
        }

        int m= (int)z;
       
         return m;
         

    }
}