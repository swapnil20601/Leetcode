# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        res = []
        #Edge case: If tree is empty
        if not root:
            return res
            
        Q = deque([root])
        flag = True
        while Q:
            size = len(Q)
            row = [0] * size

            for i in range(size):
                front = Q.popleft()
                idx = i if flag else size - 1 - i
                row[idx] = front.val
                if front.left:
                    Q.append(front.left)
                if front.right:
                     Q.append(front.right)
            
            res.append(row)
            flag = not flag
        
        return res

        