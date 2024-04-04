# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getLen(self,head):
        size = 0
        curr = head
        while curr:
            size += 1
            curr = curr.next
        return size
        

    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        len1 = self.getLen(headA)
        len2 = self.getLen(headB)
        t1 = headA
        t2 = headB
        
        if len2 > len1:

            d = len2-len1
            for _ in range(d):
                t2 = t2.next
        else:
            d = len1-len2
            for _ in range(d):
                t1 = t1.next
        
        while t1 and t2:
            if t1 is t2:
                return t1
            t1 = t1.next
            t2 = t2.next
        
        return t1
        

        