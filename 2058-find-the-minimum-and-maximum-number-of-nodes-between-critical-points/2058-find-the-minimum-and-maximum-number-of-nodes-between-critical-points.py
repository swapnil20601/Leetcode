# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def nodesBetweenCriticalPoints(self, head: Optional[ListNode]) -> List[int]:
        res = [-1,-1]
        prev = head

        #Edge case 1:
        if prev is None:
            return res
        
        curr = prev .next

        #Edge case 2:
        if curr is None:
            return res

        fwd = curr.next

        #Edge case 3:
        if fwd is None:
            return res
        
        first_cp,last_cp = -1,-1
        min_dist = math.inf
        pos = 2
        
        while fwd:
            #Check if curr is critical point?
            if (curr.val < prev.val and curr.val < fwd.val) or (curr.val > prev.val and curr.val > fwd.val):
                #check if curr is 1st critical oint
                if first_cp == -1:
                    #mark last_cp & first_cp
                    first_cp = pos
                    last_cp = pos
                #if curr is not 1st critical oint
                else:
                    #find min_dist & update last_cp
                    min_dist = min(min_dist,pos-last_cp)
                    last_cp = pos
            prev = curr
            curr = fwd
            fwd = fwd.next
            pos += 1
        
        #If there was only 1 critical point found, then return [-1,-1]
        if last_cp == first_cp:
            return res

        #Finall find max_distance & return the output arr
        max_dist = last_cp - first_cp
        res[0] = min_dist
        res[1] = max_dist
        return res