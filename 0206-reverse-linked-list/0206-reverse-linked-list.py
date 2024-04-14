# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head
        return self.helper(prev,curr)
    
    def helper(self,prev,curr):
        if not curr:
            return prev
        
        fwd = curr.next
        curr.next = prev

        recursionKaAns = self.helper(curr,fwd)
        return recursionKaAns

        