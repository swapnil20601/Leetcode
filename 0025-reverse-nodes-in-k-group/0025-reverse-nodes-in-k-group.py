# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def getKthNode(self,curr, k):
        while curr and k > 1:
            curr = curr.next
            k = k-1

        return curr


    def reverseLinkedList(self,head):
        temp = head
        prev = None
        
        while temp is not None:
            front = temp.next
            temp.next = prev
            prev = temp
            temp = front
        return prev

        
    def reverseKGroup(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        temp = head
        prev = None
        while temp:
            #first get kth node
            kthNode = self.getKthNode(temp,k)

            if not kthNode:
                if prev:
                    prev.next = temp
                break


            #If above fun does nor return None then we know there are k nodes 
            #in next group to reverse
            # store add of next node in nextNode ptr
            nextNode = kthNode.next
            #break the link of kth node to spearate the LL so that
            #we can pass this group of k nodes to reverseLL() to reverse it
            kthNode.next = None

            #Reverse LL
            self.reverseLinkedList(temp)

            #Now identify if you have reversed 1st group of k nodes or later groups
            #of k nodes bczo we want to update head accordingly

            #if it is the 1st group of k nodes, then ONLY update head to KthNode. 
            if head is temp:
                head = kthNode
            else:
                prev.next = kthNode
            
            #Now just link temp to nextNode and move temp to nextNode
            prev = temp
            temp = nextNode

        return head

                 