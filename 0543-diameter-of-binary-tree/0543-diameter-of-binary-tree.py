# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.diameter = 0

    def solve(self,root):
        if not root:
            return 0
        
        left_height = self.solve(root.left)
        right_height = self.solve(root.right)
        self.diameter = max(self.diameter, left_height + right_height)
        return 1 + max(left_height,right_height)

    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        self.solve(root)
        return self.diameter
        