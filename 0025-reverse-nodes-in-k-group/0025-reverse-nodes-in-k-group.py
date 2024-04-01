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

             #If above fun returns None then we know there are no K nodes in grp. So just link
             # previously reversed group of k nodes to whatever is left in LL. 
             #And what is this whatever left in LL? Its actually temp
            if not kthNode:
                # we do this check becoz what if in the 1st group itself there are no k nodes?
                #To undersatnd better, dry run on 1->2, k = 3  
                if prev:
                    prev.next = temp
                break


            #If above fun does not return None then it means there are k nodes 
            #to reverse. So sepaare that group of k nodes from entire LL becaoz
            # we cannot reverse just a part of LL
            nextNode = kthNode.next
            kthNode.next = None

            #Reverse LL
            self.reverseLinkedList(temp)

            #Now identify if you have reversed 1st group of k nodes or later groups
            #of k nodes bczo we want to update head accordingly.
            #if it is the 1st group of k nodes, then ONLY update head to KthNode. 
            #Else link previously reversed group of k nodes to currently reversed group of k nodes
            if head is temp:
                head = kthNode
            else:
                prev.next = kthNode
            
            #Now just update prev & temp ptrs 
            prev = temp
            temp = nextNode

        return head

                 