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
    public boolean isPalindrome(ListNode head) {        
        ListNode prev = null, forward = null, fast = head, slow = head;
        while(fast != null && fast.next != null){
            forward = slow.next;
            fast = fast.next.next;
            slow.next = prev;
            prev = slow;
            slow = forward;
        }

        if(fast != null){
            slow = slow.next;
        }

        while(prev != null && slow != null){
            if(prev.val != slow.val){
                return false;
            }
            prev = prev.next;
            slow = slow.next;
        }

        return true;
    }
}