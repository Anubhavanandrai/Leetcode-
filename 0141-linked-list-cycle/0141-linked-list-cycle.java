
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode n=head;
        ListNode m=head;

      while(m!=null && m.next!=null)
      {
        n= n.next;
        m=m.next.next;
         if(n==m)
        {
            return true;
        }
      }
      return false;
        
    }
}