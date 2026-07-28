// class Solution {
//     public String smallestPalindrome(String s) {
//         int len = s.length();

//        if(len==1){
//         return s;
//        } 

//      // to sort this string i am converting it to array
//        char[] ch = s.toCharArray();
//      //sorting
//        Arrays.sort(ch);  

//       HashMap<Character,Integer> hs = new HashMap<>();

//       //storing each char and their frequency
//       for(char c: ch)
//       {
//         hs.put(c,hs.getOrDefault(c,0) + 1);
//       } 

//      //StringBuffer to have some easy function like reverse

//      StringBuffer sb= new StringBuffer();
//       String result = "";



// //     for()
// //       {
// //        int val = hs.get(c);

// //     //    if(val)
// //     //    {
// //     //   sb.append(c);
// //     //    }

// //        for (int i = 0; i < val / 2; i++) {
// //     sb.append(c);
// // }


// for (int i = 0; i < ch.length; i++) 
// { 
//     if (i > 0 && ch[i] == ch[i - 1]) 
//         { 
//            continue; // Skip duplicate 
//         } 
//     int val = hs.get(ch[i]);

//     for (int j = 0; j < val / 2; j++) {
//         sb.append(ch[i]);
//     }
// }

//         result = sb.toString() +  + sb.reverse().toString();

//       }
// return result;
//     }




import java.util.*;

class Solution {
    public String smallestPalindrome(String s) {

        if (s.length() == 1) {
            return s;
        }

        // Convert to array and sort
        char[] ch = s.toCharArray();
        Arrays.sort(ch);

        // Store frequency
        HashMap<Character, Integer> hs = new HashMap<>();

        for (char c : ch) {
            hs.put(c, hs.getOrDefault(c, 0) + 1);
        }

        StringBuffer left = new StringBuffer();
        char middle = '\0';

        // Process each unique character only once
        for (int i = 0; i < ch.length; i++) {

            if (i > 0 && ch[i] == ch[i - 1]) {
                continue;
            }

            int freq = hs.get(ch[i]);

            // Add half of the occurrences to the left half
            for (int j = 0; j < freq / 2; j++) {
                left.append(ch[i]);
            }

            // Save the middle character if frequency is odd
            if (freq % 2 != 0) {
                middle = ch[i];
            }
        }

        String right = new StringBuffer(left).reverse().toString();

        if (middle == '\0') {
            return left.toString() + right;
        }

        return left.toString() + middle + right;
    }
}