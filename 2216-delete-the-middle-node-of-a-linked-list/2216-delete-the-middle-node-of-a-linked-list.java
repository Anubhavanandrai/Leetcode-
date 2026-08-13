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
    public ListNode deleteMiddle(ListNode head) {
        
        ListNode fast=head;
        ListNode slow = head;
      //if one node then it will be deleted and head will point to none so return null  
        if(head.next==null)
        {
            return null;
        }
       // if there are 2 element then 1st will be deleted and head will point to 2nd  
        if(head.next.next==null)
        {
           head.next =null;
            return head;
        }
        while(fast!= null && fast.next!= null)
        {
            slow=slow.next;
            fast = fast.next.next;
        }
      
   
       slow.val = slow.next.val;
       slow.next =slow.next.next;
    
      
       

       return head;
    }
}