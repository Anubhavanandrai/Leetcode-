import java.util.*;

class Solution {
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Stack<Integer> s = new Stack<>();

        ListNode current = head;

        while (current != slow) {
            s.push(current.val);
            current = current.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {

            if (s.pop() != slow.val) {
                return false;
            }

            slow = slow.next;
        }

        return true;
    }
}