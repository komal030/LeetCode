class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val)
            head = head.next;
        ListNode temp1 = head;
        ListNode temp2 = head;
        if (head != null && head.next != null) {
            temp2 = head.next;
        } else {
            return head;
        }
        while (temp2 != null) {
            if (temp2.val == val) {
                temp1.next = temp2.next;
            } else {
                temp1 = temp1.next;
            }
            temp2 = temp1 != null ? temp1.next : null;
        }
        return head;
    }
}
