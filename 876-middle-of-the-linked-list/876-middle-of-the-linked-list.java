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
    public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        int len = 0;
        
        while(curr != null){
            curr = curr.next;
            len++;
        }
        curr = head;
        for(int i= 0; i < len/2; i++){
            curr = curr.next;
        }
        return curr;
    }
}