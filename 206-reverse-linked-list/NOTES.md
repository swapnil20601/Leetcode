**Recurive soln: For iteraive see submited soln on eetcode. You were able to do iterative**
​
public ListNode reverseList(ListNode head) {
if(head == null || head.next == null){
return head;
}
ListNode newHead = reverseList(head.next);
head.next.next = head;
head.next = null;
return newHead;
}
If u want to see visualy:  see video: https://www.youtube.com/watch?v=MRe3UsRadKw