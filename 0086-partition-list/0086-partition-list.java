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
    public ListNode partition(ListNode head, int x) {
        if(head == null) return null;

        ListNode small = new ListNode(-1);
        ListNode s = small;
        ListNode large = new ListNode(-1);
        ListNode l = large;

        ListNode curr = head;
        while(curr != null){
            ListNode newNode = new ListNode(curr.val);
            if(curr.val < x){
                s.next = newNode;
                s = s.next;
            }
            else{
                l.next = newNode;
                l = l.next;
            }
            curr = curr.next;
        }
        s.next = large.next;
        return small.next;
    }
}