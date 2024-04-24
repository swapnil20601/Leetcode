class Solution:
    def MAH(self,heights):
        max_area = -math.inf
        stack = []
        n = len(heights)
        left = [0] * n
        for i in range(0,n):
            while stack and heights[stack[-1]] >= heights[i]:
                stack.pop()
            if stack:
                left[i] = stack[-1] + 1
            stack.append(i)

        stack = []
        right = [n-1] * n
        for i in range(n-1,-1,-1):
            while stack and heights[stack[-1]] >= heights[i]:
                stack.pop()
            if stack:
                right[i] = stack[-1] - 1
            stack.append(i)

        for i in range(n):
            width = right[i] - left[i] + 1
            area = heights[i] * width
            max_area = max(max_area,area)

        return max_area
    
    def maximalRectangle(self, matrix: List[List[str]]) -> int:
        rows = len(matrix)
        cols = len(matrix[0])

        #Pick 1st row of matrix and set it as resultant array in which we will keep on adding
        #previous rows elemets
        arr = matrix[0]

        #Convert every ele in arr from str to int
        arr = [int(x) for x in arr]
        
        #initialize maxArea with maximum rectangle area within 1st row thatb MAH() returns
        maxArea = self.MAH(arr)

        #Traverse matrix starting from 2nd row and find the maximum area of rectangle
        # by passing every row to MAH()
        for i in range(1,rows):
            for j in range(cols):

                #if ele at current row and current col = 0, then set it as 0 in arr[]
                #if not then it means it is 1. So add it to previous value of arr[j]
                if matrix[i][j] == '0':
                    arr[j] = 0
                else:
                    arr[j] = arr[j] + int(matrix[i][j])

                #Call MAH() by passing the updated arr[] & update the maxArea with maximum
                #area by comparing current maxArea and area returned by MAH()
            maxArea = max(maxArea,self.MAH(arr))
        
        return maxArea