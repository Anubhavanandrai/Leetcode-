
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        if (head == null) 
        {
            return null;
        }

        ListNode current = head;
        ListNode back = head;

        while (current!= null) 
        {
            if (current.val == val) 
            {
                if (current == head) 
                {
                    current = current.next;
                    head = current;
                    back = current;
                } 
                else 
                {
                    back.next= current.next;
                    current = current.next;
                }
            }
            else{
                    back=current;
         current=current.next;
            }
      
        }

        return head;
    }
}