/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       int n=0;int m=0;
       ListNode temp1=headA;
       ListNode temp2=headB;
       while(temp1!=null)
       {
           n++;
           temp1=temp1.next;
       }
       while(temp2!=null)
       {
           m++;
           temp2=temp2.next;
       }
       temp1=headA;
       temp2=headB;
       while(m<n)
       {
           temp1=temp1.next;
           m++;
       }
       while(n<m)
       {
           n++;
           temp2=temp2.next;
       }
       while(temp1!=null)
       {
           if(temp1==temp2)
           return temp1;
           temp1=temp1.next;
           temp2=temp2.next;
       }
       return null;
    }
}
