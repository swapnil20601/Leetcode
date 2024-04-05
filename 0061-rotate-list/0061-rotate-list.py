# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        if not head:
            return head
            
        tail = head
        length = 1

        #Step 1: Reach tail & also find len of LL at the same time
        while tail.next:
            length += 1
            tail = tail.next
        
        #Connecr tail to head
        tail.next =head
        
        #Modify k to handle cases where k >= len(LL)
        k %= length

        #Step 2: Reach node = len-k
        temp = head
        for _ in range(1,length-k):
            temp = temp.next
        
        #Step 3: Update head
        head = temp.next

        #Step 4: Break the link betn head & temp
        temp.next = None

        return head
        