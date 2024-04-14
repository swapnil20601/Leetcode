# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeZeroSumSublists(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummyNode = ListNode(0)
        dummyNode.next = head
        prefixSum = 0
        map = {prefixSum:dummyNode}

        curr = head
        while curr:
            prefixSum += curr.val
            if prefixSum in map:
                start = map.get(prefixSum)
                temp = start
                sum = prefixSum
                while temp != curr:
                    temp = temp.next
                    sum += temp.val
                    if temp != curr:
                        map.pop(sum)
                start.next = curr.next
            else:
                map[prefixSum] = curr
            
            curr = curr.next
        
        return dummyNode.next
        


        