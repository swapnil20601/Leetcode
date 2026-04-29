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
        ListNode tail = head;

        int len = getLength(head);
        k = k % len;

        //Step 1: Reach tail node & join it to head
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = head;

        //Step 2: reach to (len-k)th node
        for(int i = 1; i < len-k; i++){
            tail = tail.next;
        }

        //Step 3: Update new head & break the link after tail node
        head = tail.next;
        tail.next = null;

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