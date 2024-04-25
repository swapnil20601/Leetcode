class Solution:
    def trap(self, height: List[int]) -> int:
        n = len(height)
        ans = 0
        left_max = [0] * n
        right_max = [0] * n

        #Set 1st ele of left_max[] to 1st ele of arr[] 
        left_max[0] = height[0]

        #Fill in the left_max[] starting from 1st index
        for i in range(1,n):
            left_max[i] = max(height[i],left_max[i-1])
        
        #Set last ele of right_max[] to last ele of arr[] 
        right_max[n-1] = height[n-1]

        #Fill in the right_max[] starting from n-1 to 0th index
        for i in range(n-2,-1,-1):
            right_max[i] = max(height[i],right_max[i+1])

        #Calculate total water trapped 
        for i in range(n):
            ans += min(left_max[i],right_max[i]) - height[i]            
        
        return ans
                

        