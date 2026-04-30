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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        Stack<ListNode> s1 = new Stack<>();
        Stack<ListNode> s2 = new Stack<>();

        while(l1 != null){
            s1.push(l1);
            l1 = l1.next;
        }

        while(l2 != null){
            s2.push(l2);
            l2 = l2.next;
        }

        ListNode head = null;

        while(!s1.isEmpty() || !s2.isEmpty()){
            int data = carry;
            if(!s1.isEmpty()){
                data += s1.pop().val;
            }

            if(!s2.isEmpty()){
                data += s2.pop().val;
            }

            carry = data / 10;
            ListNode node = new ListNode(data % 10);

            node.next = head;
            head = node;
        }

        if(carry > 0){
            ListNode node = new ListNode(carry);
            node.next = head;
            return node;
        }

        return head;
    }
}