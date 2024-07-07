# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def solve(self,node,target):
        if not node:
            return 0
        
        count = 0
        if node.val == target:
            count = 1
        
        newSum = target - node.val

        count += self.solve(node.left,newSum)
        count += self.solve(node.right,newSum)
        return count
        

    def pathSum(self, root: Optional[TreeNode], targetSum: int) -> int:
        if not root:
            return 0

        left_count = self.pathSum(root.left,targetSum)
        right_count = self.pathSum(root.right,targetSum)
        paths = self.solve(root,targetSum)
        return left_count + right_count + paths
          