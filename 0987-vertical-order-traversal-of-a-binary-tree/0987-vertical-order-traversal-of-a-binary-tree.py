# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def dfs(self,root,map,row,col):
        #Base case
        if not root:
            return
        
        #insert in map -:  col -> {row:(node's value)}
        map[col].append((row,root.val))
        self.dfs(root.left,map,row+1,col-1)
        self.dfs(root.right,map,row+1,col+1)

        
    def verticalTraversal(self, root: Optional[TreeNode]) -> List[List[int]]:
        res = []
        #col -> [row -> [list of nodes]]
        map = defaultdict(list)
        #dfs call to fill the map
        self.dfs(root,map,0,0)
        #take care of sorting & fill the res
        #column-wise sorting
        for col in sorted(map.keys()):
            #row-wise sorting
            map[col].sort(key=lambda x: (x[0], x[1]))
            res.append([val for _, val in map[col]])
        
        return res

    
        