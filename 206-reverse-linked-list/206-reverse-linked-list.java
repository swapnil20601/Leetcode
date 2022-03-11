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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode curr = head;
        ListNode tail = null;
        
        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = tail;
            tail = curr;
            curr = nextNode;
        }
        
        return tail;
    }
}