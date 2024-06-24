# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def solve(self,root,level,res):
        #Base Case
        if not root:
            return
        
        #If level == len(res), then add this node to res bcoz it is the rightmost node at current level
        if level == len(res):
            res.append(root.val)

        #Move to next level & Call recursion on right subtree firtst becoz we want right-most node
        self.solve(root.right,level+1,res)

        #Move to next level & Call recursion on left subtree
        self.solve(root.left,level+1,res)

        
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        res = []
        self.solve(root,0,res)
        return res
        