/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
       int size =0;
       ListNode temp = head;
       ListNode current = head;
         ListNode ls = head;
       while(ls!=null)
       {
          size++;
          ls = ls.next;
       }
       int last = size - k + 1;
       int l=0,m=0;
       
       for(int i=1;i<=Math.max(k, last);i++)
       {
          if(i==k)
          {
            l= temp.val;
          }
          if(i==last)
          {
            m = temp.val;
          }
          temp = temp.next;
       }
       System.out.println("value : "+ l + " " + m);
         
       for(int i=1;i<=Math.max(k, last);i++)
       {
         
          if(i==k)
          {
            current.val =m;
          }
          else if(i==last)
          {
             current.val=l; 
          }
           current = current.next;
       }
       
   return head;

    }
}