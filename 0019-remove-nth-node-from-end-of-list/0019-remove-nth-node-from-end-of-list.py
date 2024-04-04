# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        fast = head
        for _ in range(n):
           fast = fast.next
        
        slow = head

        #Edge case when N = 5. In this case fast will bcome None.
        #To understand better, dry run on 1-2-3-4-5 for N=5
        if not fast:
            return head.next
        
        while fast.next:
            slow = slow.next
            fast = fast.next 
        
        slow.next = slow.next.next
        return head