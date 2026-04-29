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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;

        k = k % getLength(head);

        for(int i = 0; i < k; i++){
            while(curr.next != null){
                prev = curr;
                curr = curr.next;
            }
            curr.next = head;
            head = curr;
            prev.next = null;
        }
        return head;
    }

    private int getLength(ListNode head){
        ListNode curr = head;
        int len = 0;
        while(curr != null){
            len++;
            curr = curr.next;
        }
        return len;
    }
}