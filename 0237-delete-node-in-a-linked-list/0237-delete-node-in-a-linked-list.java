/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
    
//just change current node as next node because we cant go back.
    node.val = node.next.val;
    node.next =node.next.next;

    }
}