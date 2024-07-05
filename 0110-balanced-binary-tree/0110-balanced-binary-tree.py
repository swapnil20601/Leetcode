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
        
        #Recursively call for left subtree. It will return a tuple : (left subtree's height, boolean val if left subtree is balanced).
        #Unpack those values left_ht = res[0] & is_left_balanced = res[1]
        left_ht,is_left_balanced = self.solve(root.left,res)

        #Recursively call for right subtree. It will return a tuple : (right subtree's height, boolean val if right subtree is balanced).
        #Unpack those values right_ht = res[0] & is_right_balanced = res[1]
        right_ht,is_right_balanced = self.solve(root.right,res)

        #Find absolute diff between left-subtree & right-subtrees's height
        diff = abs(left_ht - right_ht)

        #Find new height as we do usually by taking in account current node
        curr_ht = 1 + max(left_ht, right_ht)

        #Return updated values of res[]
        return (curr_ht,is_left_balanced and is_right_balanced and diff <= 1)


    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        ans = self.solve(root,(0,True))
        return ans[1]