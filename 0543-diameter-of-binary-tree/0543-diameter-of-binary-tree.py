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
        
        lh = self.height(root.left)
        rh = self.height(root.right)
        return 1 + max(lh,rh)

    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        #base case
        if not root:
            return 0
        
        case_1 = self.diameterOfBinaryTree(root.left)
        case_2 = self.diameterOfBinaryTree(root.right)
        case_3 = self.height(root.left) + self.height(root.right)
        diameter = max(case_1,max(case_2,case_3))
        return diameter

        

        