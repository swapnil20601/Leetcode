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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode t1 = reverseList(l1);
        ListNode t2 = reverseList(l2);
        ListNode head = null;

        while(t1 != null || t2 != null){
            int data = carry;
            if(t1 != null){
                data += t1.val;
                t1 = t1.next;
            }

            if(t2 != null){
                data += t2.val;
                t2 = t2.next;
            }

            carry = data / 10;
            ListNode node = new ListNode(data % 10);

            node.next = head;
            head = node;
        }

        if(carry > 0){
            ListNode node = new ListNode(carry);
            node.next = head;
            return node;
        }

        return head;
    }

    private ListNode reverseList(ListNode head) {
        ListNode curr = head, prev = null, forward = head;
        while(curr != null){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        head = prev;
        return head;
    }
}