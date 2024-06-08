# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0

        #Find height of left subtree
        left_height = self.maxDepth(root.left)

        #Find height of right subtree
        right_height = self.maxDepth(root.right)

        #Find final height as max(ht of left subtree, ht of right subtree) + 1 for root node
        return max(left_height, right_height) + 1
        