# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def solve(self,inorder,inStart,inEnd,postorder,postStart,postEnd,map):
        #Base Case
        if postStart > postEnd or inStart > inEnd:
            return None

        #Solve 1 case
        #Create root node from postorder[] with value at wherever you are currently standing
        root = TreeNode(postorder[postEnd])

        #Search for the root node in inorder[] to build its left & right subtree & return its index
        inRoot = map[root.val]

        numsLeft = inRoot - inStart

        #Constructing left & right subtree will be done by Recursion
        # Recursively build the left subtree
        root.left = self.solve(inorder,inStart,inRoot-1,postorder,postStart,postStart+numsLeft-1,map)
 
        # Recursively build the right subtree
        root.right = self.solve(inorder,inRoot+1,inEnd,postorder,postStart+numsLeft,postEnd-1,map)

        # Return the current root node
        return root

    def buildTree(self, inorder: List[int], postorder: List[int]) -> Optional[TreeNode]:
        # Create a map to store indices of elements in the inorder traversal
        map = {val: idx for idx, val in enumerate(inorder)}

        return self.solve(inorder, 0 ,len(inorder)-1, postorder, 0, len(postorder)-1,map)
        