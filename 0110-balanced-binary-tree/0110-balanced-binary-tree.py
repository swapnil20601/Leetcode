# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def height(self,root):
        if not root:
            return 0
        left_ht = self.height(root.left)
        right_ht = self.height(root.right)
        return 1 + max(left_ht,right_ht)

    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        #Base Case
        if not root:
            return True

        #I will solve case for current node
        left_ht = self.height(root.left)
        right_ht = self.height(root.right)
        diff = abs(left_ht - right_ht) <= 1

        #Find leftKaAns & rightKaAns using Recursion
        leftKaAns = self.isBalanced(root.left)
        rightKaAns = self.isBalanced(root.right)


        return leftKaAns and rightKaAns and diff
        