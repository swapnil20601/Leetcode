# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, left: Optional[ListNode], right: Optional[ListNode]) -> Optional[ListNode]:
        #if either of the lists are empty, then return which ever is non-empty
        if not left or not right:
            return right or left
        
        #Create dummy node
        dummy = ListNode(-1)
        temp = dummy

        #Process until both the lists are NON-empty
        while left and right:
            if left.val <= right.val:
                temp.next = left
                temp = left
                left = left.next
            else:
                temp.next = right
                temp = right
                right = right.next

        #If left list is not exhausted yet, then connect temp to left list
        if left:
            temp.next = left
        
        #If right list is not exhausted yet, then connect temp to right list
        if right:
            temp.next = right

        return dummy.next



        