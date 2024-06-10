# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        #Base Cases
        if not root or root is p or root is q:
            return root
        
        #Find leftKaAns & rightKaAns using Recursion
        leftKaAns = self.lowestCommonAncestor(root.left,p,q)
        rightKaAns = self.lowestCommonAncestor(root.right,p,q)

        #Solve 1 case by hadnling 4 cases that we saw

        #Case 1: If leftKaAns is None, then return rightKaAns from here
        if not leftKaAns:
            return rightKaAns
        #Case 2: If rightKaAns is None, then return leftKaAns from here
        elif not rightKaAns:
            return leftKaAns
        #Case 3:If both rightKaAns and leftKaAns are None, then return None
        #Case 4: If neither of rightKaAns and leftKaAns are None, then it means we found LCA & what is LCA? --> The node you are standing on.
        #And you are standing on root. So return root
        else:
            return root
        
      