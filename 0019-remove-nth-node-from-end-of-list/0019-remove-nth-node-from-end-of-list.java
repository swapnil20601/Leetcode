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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int len = getLength(head);

        if(len-n == 0){
            return head.next;
        }

        for(int i = 1; i < len-n; i++){
            curr = curr.next;
        }

        curr.next = curr.next.next;
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