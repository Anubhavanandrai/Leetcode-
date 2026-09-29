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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode current = head;
        ListNode prev = head;

        while (n > 0 && current != null) {
            current = current.next;
            n--;
        }

        if (current == null) {
            return head.next;
        }

        while (current.next != null) {
            prev = prev.next;
            current = current.next;
        }
        
        if(prev.next!=null)
        {
          prev.next=prev.next.next;
          
          }
        else{
          prev.next=null;
          }
          
 

        return head;
    }
    
}