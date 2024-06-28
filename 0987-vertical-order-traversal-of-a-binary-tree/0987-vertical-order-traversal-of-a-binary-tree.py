# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def verticalTraversal(self, root: Optional[TreeNode]) -> List[List[int]]:
        result = []
        map = defaultdict(list)
        if not root:
            return result

        queue = deque([(root, 0, 0)])

        while queue:
            node, row, col = queue.popleft()
            map[col].append((row, node.val))

            if node.left:
                queue.append((node.left, row + 1, col - 1))
            if node.right:
                queue.append((node.right, row + 1, col + 1))

        for col in sorted(map.keys()):
            map[col].sort(key=lambda x: (x[0], x[1]))
            result.append([val for _, val in map[col]])
        
        return result 

    
        