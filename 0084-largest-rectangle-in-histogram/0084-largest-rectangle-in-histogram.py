class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        max_area = -math.inf
        stack = []
        n = len(heights)
        left = [-1] * n
        for i in range(0,n):
            while stack and heights[stack[-1]] >= heights[i]:
                stack.pop()
            if stack:
                left[i] = stack[-1] + 1
            else:
                left[i] = 0
            stack.append(i)

        stack = []
        right = [n-1] * n
        for i in range(n-1,-1,-1):
            while stack and heights[stack[-1]] >= heights[i]:
                stack.pop()
            if stack:
                right[i] = stack[-1] - 1
            else:
                right[i] = n-1
            stack.append(i)

        for i in range(n):
            width = right[i] - left[i] + 1
            area = heights[i] * width
            max_area = max(max_area,area)
    
        return max_area
        