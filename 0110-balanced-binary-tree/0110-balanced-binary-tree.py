# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def solve(self,root,res):
        if not root:
            return (0,True)
        
        left_ht = self.solve(root.left,res)
        right_ht = self.solve(root.right,res)
        diff = abs(left_ht[0] - right_ht[0])
        ht = 1 + max(left_ht[0], right_ht[0])
        return (ht,left_ht[1] and right_ht[1] and diff <= 1)

        # left_ht,l_bal = self.solve(root.left,res)
        # right_ht,r_bal = self.solve(root.right,res)
        # return (1+max(left_ht,right_ht), l_bal and r_bal and abs(left_ht - right_ht) <= 1)
        

    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        ans = self.solve(root,(0,True))
        return ans[1]