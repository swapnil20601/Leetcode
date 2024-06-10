# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def solve(self,root,total,target):
        #Base Case
        if not root:
            return False
        
        #If currently I am standing at a leaf node, then verify if total == target? & return True/False depedning on that
        if not root.left and not root.right:
            total += root.val
            if total == target:
                return True
            else:
                return False
        
        total += root.val
        leftAns = self.solve(root.left,total,target)
        rightAns = self.solve(root.right,total,target)
        return leftAns or rightAns


    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
        return self.solve(root,0,targetSum)
        