# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def solve(self, preorder, preStart, preEnd, inorder, inStart, inEnd, inMap):
        if preStart > preEnd or inStart > inEnd:
            return None

        # Create a new TreeNode with value at the current preorder index
        root = TreeNode(preorder[preStart])

        # Find the index of the current root value in the inorder traversal
        inRoot = inMap[root.val]

        # Calculate the number of elements in the left subtree
        numsLeft = inRoot - inStart

        # Recursively build the left subtree
        root.left = self.solve(preorder, preStart + 1, preStart + numsLeft,
                                    inorder, inStart, inRoot - 1, inMap)

        # Recursively build the right subtree
        root.right = self.solve(preorder, preStart + numsLeft + 1, preEnd,
                                     inorder, inRoot + 1, inEnd, inMap)

        # Return the current root node
        return root
    
    def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:
        inMap = {val: idx for idx, val in enumerate(inorder)}

        return self.solve(preorder, 0, len(preorder)-1, inorder, 0, len(inorder)-1, inMap)

        