# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapNodes(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        start = None
        end = None
        curr = head

        for _ in range(1,k):
            curr = curr.next
        
        start = curr
        end = head
        curr = curr.next

        while curr:
            curr = curr.next
            end = end.next

        start.val,end.val = end.val,start.val
        return head

        