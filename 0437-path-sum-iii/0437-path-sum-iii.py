# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def dfs(self,root,prefix_sum,target,map):
        if not root:
            return 0
        
        prefix_sum += root.val
        paths = map.get(prefix_sum - target, 0)

        map[prefix_sum] = map.get(prefix_sum, 0) + 1

        paths = paths + self.dfs(root.left,prefix_sum,target,map) +  self.dfs(root.right,prefix_sum,target,map)

        #Now backtrack so that frequencies on root.left,map,target,prefix_sum are updated correctly in map
        map[prefix_sum] = map[prefix_sum] - 1

        return paths


    def pathSum(self, root: Optional[TreeNode], targetSum: int) -> int:
        map = {0:1}
        
        return self.dfs(root,0,targetSum,map)
        
        