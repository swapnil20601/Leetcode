"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]': 
        #Step 1:
        curr = head
        while curr:
            dummy = Node(curr.val)
            dummy.next = curr.next
            curr.next = dummy
            curr = curr.next.next
        
        #Step 2:
        curr = head
        while curr:
            fwd = curr.next.next
            dummy = curr.next
            dummy.random = curr.random.next if curr.random else None
            curr = fwd

        #Step 3:
        dummyNode = Node(-1)
        curr = head
        res = dummyNode

        while curr:
            res.next = curr.next
            res = res.next
            curr.next = res.next
            curr = res.next

        return dummyNode.next



        