# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.ans = 0

    def solve(self,root, target):
        if not root:
            return
        
        if target == root.val:
            self.ans += 1

        self.solve(root.left, target - root.val)
        self.solve(root.right, target - root.val)

    def pathSum(self, root: Optional[TreeNode], targetSum: int) -> int:
        if not root:
            return 0
        
        self.solve(root,targetSum)
        self.pathSum(root.left,targetSum)
        self.pathSum(root.right,targetSum)

        return self.ans
        
        