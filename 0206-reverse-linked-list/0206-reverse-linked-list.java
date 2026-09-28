
class Solution {
    public ListNode reverseList(ListNode head) {
        
       if(head==null || head.next==null)
       {
        return head;
       } 
       ListNode current=head;
       ListNode prev=head;

       while(current!=null)
       {
               if(current==head)
               {
                ListNode x=current.next;
                current.next=null;
                current=x;
               }
              else
              {
                ListNode l=current.next;
                current.next=prev;
                prev=current;
                current=l;

               }
       }
       head=prev;
       return head;
    }
}