# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def solve(self,head,carry):
        #Base case:
        if not head:
            return carry
        
        #Reach until last node
        carry = self.solve(head.next,carry)

        #Solve 1 case
        prod = (head.val*2)+carry
        head.val = prod % 10
        carry = prod // 10

        return carry


    def doubleIt(self, head: Optional[ListNode]) -> Optional[ListNode]:
        carry = self.solve(head,0)

        #Check for an extra node if there is any
        if carry != 0:
            n = ListNode(carry)
            n.next = head
            head = n
        
        return head

        