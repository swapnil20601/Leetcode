# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        tail = None
        slow = head
        fast = head.next
        sum = 0

        while fast:
            if fast.val != 0:
                sum += fast.val
            else:
                slow.val = sum
                tail = slow
                slow = slow.next
                sum = 0

            fast = fast.next

        tail.next = None
        return head