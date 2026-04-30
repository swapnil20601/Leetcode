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

        ListNode curr = head;
        ListNode temp = null;
        Stack<ListNode> s = new Stack<>();

        while(curr != null){
            s.push(curr);
            curr = curr.next;
        }

        curr = head;

        //We pop top half nodes from stack. But stack size could be odd or even
        //This is why we find ceil value of (stack.size()/2) to handle odd and even
        //sizes of stack. Formula = (numerator + denominator - 1) / denominator
        int ceil = (s.size() + 2 - 1) / 2;
        while(s.size() > ceil){
            ListNode topNode = s.pop();
            temp = curr.next;
            curr.next = topNode;
            topNode.next = temp;
            curr = temp;
        }

        curr.next = null;
    }
}