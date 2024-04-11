# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapNodes(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        if not head:
            return head
            
        start = head
        end = head
        len = 0

        for _ in range(1,k):
            start = start.next
        
        while end:
            end = end.next
            len = len+1
        
        len = len-k+1
        end = head

        for _ in range(1,len):
            end = end.next
        
        start.val,end.val = end.val,start.val
        return head

        