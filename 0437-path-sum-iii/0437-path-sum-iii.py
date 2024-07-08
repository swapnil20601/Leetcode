# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.count = 0

    def dfs(self, node, map, target, currSum):
        if not node:
            return
        
        currSum += node.val
        if currSum == target:
            self.count += 1
        
        if currSum - target in map:
            self.count +=  map[currSum - target]
        map[currSum] += 1
        self.dfs(node.left, map, target, currSum)
        self.dfs(node.right, map, target, currSum)
        map[currSum] -= 1


    def pathSum(self, root: Optional[TreeNode], targetSum: int) -> int:
        map = defaultdict(int)
        self.dfs(root,map,targetSum, 0)
        return self.count
        
        
        