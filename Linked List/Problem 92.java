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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head==null || left == right)
        return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;


        ListNode prevRight=null,next=null,current;
        current = head;

        for(int i=1;i<left;i++)
        prev = prev.next;

        current = prev.next;

        int range = (right-left)+1;


        while(current!=null && range!=0)
        {
            next = current.next;
            current.next = prevRight;
            prevRight = current;
            current = next;
            range--;
        }

        prev.next.next = current;
        prev.next = prevRight;

        return dummy.next;
    }
}
