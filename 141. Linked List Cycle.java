/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null)
        return false;
        ListNode slow=head,fast=head;
        if(head.next!=null)
        fast=head.next.next;
        else
        return false;
            while(fast!=null&&fast.next!=null)
            {
            if(slow==fast)
                return true;
             slow=slow.next;
             fast=fast.next.next;
            }
            return false;
        
    }
}
