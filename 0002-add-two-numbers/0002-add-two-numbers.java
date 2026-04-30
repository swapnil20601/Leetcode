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
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode tail = null;
        ListNode head = null;

        while(t1 != null && t2 != null){
            int data = carry + t1.val + t2.val;
            carry = data / 10;
            ListNode node = new ListNode(data % 10);

            if(head == null){
                head = node;
            }
            else{
                tail.next = node;
            }
            tail = node;
            t1 = t1.next;
            t2 = t2.next;
        }

        while(t2 != null){
            int data = carry + t2.val;
            carry = data / 10;
            ListNode node = new ListNode(data % 10);
            tail.next = node;
            tail = node;
            t2 = t2.next;
        }

        while(t1 != null){
            int data = carry + t1.val;
            carry = data / 10;
            ListNode node = new ListNode(data % 10);
            tail.next = node;
            tail = node;
            t1 = t1.next;
        }

        if(carry > 0){
            tail.next = new ListNode(carry);
        }

        return head;
    }
}