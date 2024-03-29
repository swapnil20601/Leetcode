# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self,head):
        slow=fast=head
        while fast.next:
            fast = fast.next
            if fast.next:
                fast = fast.next
                slow = slow.next
        return slow

    def reverseLL(self,prev,curr):
        #Basecase
        if not curr:
            return prev
        
        nextNode = curr.next
        curr.next = prev
        prev = curr
        curr = nextNode

        return self.reverseLL(prev,curr)

    def compareList(self,head1,head2):
        t1 = head1
        t2 = head2
        while t1 and t2:
            if t1.val != t2.val:
                return False
            t1 = t1.next
            t2 = t2.next
        return True


    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        #Find middle of LL
        midNode = self.middleNode(head)

        #Break the LL into 2 halves. How to break?
        #First store head of 2nd LL & then point midNode's next to Null to break given
        #LL into 2 halves
        head2 = midNode.next
        midNode.next = None

        #Reverse 2nd LL
        #We need prev & cirrurent ptrs to pass to reverseLL(). So we knoe prev is None
        # & we can point curr to head2. reverseLL() will give us head of reversed LL. 
        # We have to set that head as head2
        prev = None
        curr = head2
        head2 = self.reverseLL(prev,curr)

        #Compare 2 LL
        return self.compareList(head,head2)