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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

        ListNode middle = getMiddleNode(head);
        ListNode revHead = reverseLL(middle);
        ListNode curr = head;
        ListNode temp = null;
        ListNode forward = null;
        while(revHead.next != null){
            temp = revHead.next;
            forward = curr.next;
            curr.next = revHead;
            revHead.next = forward;
            curr = forward;
            revHead = temp;
        }
    }

    private ListNode getMiddleNode(ListNode head){
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode reverseLL(ListNode head){
        ListNode prev = null, curr = head, n = null;
        while(curr != null){
            n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
        }
        return prev;
    }
}