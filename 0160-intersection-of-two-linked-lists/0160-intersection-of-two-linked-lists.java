
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
       ListNode temp = headA;
       ListNode temp2 =headB;
       int size=0,size2=0;
       
       while(temp!=null)
       {
           temp=temp.next;
           size++; 
       }
        while(temp2!=null)
       {
           temp2=temp2.next; 
          size2++;
       }

       
        if (size > size2) {

            temp = headA;
            temp2 = headB;

            int diff = size - size2;

            for (int i = 0; i < diff; i++) {
                temp = temp.next;
            }

        } 
        else {

            temp = headA;
            temp2 = headB;

            int diff = size2 - size;

            for (int i = 0; i < diff; i++) {
                temp2 = temp2.next;
            }
        }
//every linkedlist ultimately meets at null
        while (temp != temp2) {
            temp = temp.next;
            temp2 = temp2.next;
        }
        return temp; 
    }
}