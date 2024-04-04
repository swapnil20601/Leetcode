# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        t1 = headA
        t2 = headB

        #Edge cases: if eother of the 2 LLs is empty
        if not t1 or not t2:
            return None 

        #Run the loop until both ptrs are pointing on different nodes & not on same npode
        while t1 is not t2:
            t1 = t1.next
            t2 = t2.next

            #If t1 & t2 meet, then it is the intersection point
            if t1 is t2:
                return t1

            #If t1 reached last node, then move it to head2
            if t1 is None:
                t1 = headB
            
            #If t2 reached last node, then move it to head1
            if t2 is None:
                t2 = headA
        
        return t1


        
        

        