# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.count = 0
        self.k = 0
        self.h = defaultdict(int)

    def dfs(self, node, currSum):
        if not node:
            return
        
        currSum += node.val
        if currSum == self.k:
            self.count += 1
        self.count += self.h[currSum - self.k]
        self.h[currSum] += 1
        self.dfs(node.left, currSum)
        self.dfs(node.right, currSum)
        self.h[currSum] -= 1


    def pathSum(self, root: Optional[TreeNode], targetSum: int) -> int:
        self.k = targetSum
        self.dfs(root, 0)
        return self.count
        
        
        