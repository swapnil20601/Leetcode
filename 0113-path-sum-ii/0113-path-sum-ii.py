# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def solve(self,root,temp,ans,total,target):
        if not root:
            return

        #Solve 1 case
        total += root.val
       
        #leaf node
        if not root.left and not root.right:
            if total == target:
                ans.append([*temp,root.val])

        temp.append(root.val)

        #Baki recursion sambhal lega
        self.solve(root.left,temp,ans,total,target)
        self.solve(root.right,temp,ans,total,target)
        total -= root.val
        temp.pop()


    def pathSum(self, root: Optional[TreeNode], targetSum: int) -> List[List[int]]:
        result = []
        self.solve(root,[],result,0,targetSum)
        return result

        


       
        