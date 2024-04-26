class Solution:
    def trap(self, height: List[int]) -> int:
        n = len(height)
        ans = 0
        l = 0
        r = n-1
        left_max = -1
        right_max = -1

        for i in range(1,n):
            if height[l] <= height[r]:
                if height[l] > left_max:
                    left_max = height[l]
                else:
                    ans += left_max-height[l]
                l += 1
            else:
                if height[r] > right_max:
                    right_max = height[r]
                else:
                    ans += right_max-height[r]
                r -= 1
                
        return ans
                

        