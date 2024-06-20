# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def searchInorder(self,inorder,element):
        for i in range(len(inorder)):
            if inorder[i] == element:
                return i
        return -1

    def solve(self, preorder,inorder,preStart,preEnd,inStart,inEnd,map):
        #Base Case
        if preStart > preEnd or inStart > inEnd:
            return None

        #Solve 1 case
        #Create root node from preorder[] with value at wherever you are currently standing
        root = TreeNode(preorder[preStart])

        #Search for the root node in inorder[] to build its left & right subtree & return its index
        inRoot = map[root.val]

        numsLeft = inRoot - inStart

        #Constructing left & right subtree will be done by Recursion
        # Recursively build the left subtree
        root.left = self.solve(preorder,inorder,preStart+1,preStart+numsLeft,inStart,inRoot-1,map)
 
        # Recursively build the right subtree
        root.right = self.solve(preorder,inorder,preStart+numsLeft+1,preEnd,inRoot+1,inEnd,map)

        # Return the current root node
        return root
    
    def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:

        # Create a map to store indices of elements in the inorder traversal
        map = {val: idx for idx, val in enumerate(inorder)}

        return self.solve(preorder, inorder, 0,len(inorder)-1, 0, len(inorder)-1,map)

        