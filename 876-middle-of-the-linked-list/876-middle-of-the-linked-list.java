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
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode currNode = head;
        int len = 0;
        
        while(currNode != null){
            len++;
            currNode = currNode.next;
        }
        
        int middleNode = (len/2)+1;
        currNode = head;
        
        while(middleNode > 1){
            currNode = currNode.next;
            middleNode -= 1;
        }
        
        return currNode;
    }
}