# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def solve(self,node,target,res):
        if not node:
            return
        
        if target == node.val:
            res[0] = res[0] + 1
        
        self.solve(node.left,target - node.val,res)
        self.solve(node.right,target - node.val,res)
        

    def pathSum(self, root: Optional[TreeNode], targetSum: int) -> int:
        if not root:
            return 0

        res = [0]

        self.solve(root,targetSum,res)
        if root.left:
            res[0] = res[0] + self.pathSum(root.left,targetSum)
        
        if root.right:
            res[0] = res[0] + self.pathSum(root.right,targetSum)
        return res[0]

          