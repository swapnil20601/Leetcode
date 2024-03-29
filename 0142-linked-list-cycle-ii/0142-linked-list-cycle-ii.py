# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        #Code for detecting loop in LL
        slow = fast = head
        while fast:
            fast = fast.next
            if fast:
                fast = fast.next
                slow = slow.next
            
            if slow == fast:
                break
        
        # if there is no cycle, we have to return None
        if fast is None:
            return None
        
        #Code to find starting of the loop
        slow = head
        while slow != fast:
            fast = fast.next
            slow = slow.next
        
        return slow