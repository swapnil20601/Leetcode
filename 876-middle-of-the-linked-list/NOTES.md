i**Brute Force:**
TC= O(N)  with 2 pass
​
Steps:
1. Find length of LL by going over it till end
2. Then divide lenght into half & visit until that node
​
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
----------------------------------------------------------------------
**Slow & faster pointer:**
TC= O(N) with 1 pass