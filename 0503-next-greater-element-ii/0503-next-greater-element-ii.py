class Solution:
    def nextGreaterElements(self, nums: List[int]) -> List[int]:
        stack = []
        n = len(nums)
        ans = [-1] * n

        for i in range(2*n-1, -1, -1):
            while stack and stack[-1] <= nums[i%n]:
                stack.pop()
            
            #consider only indexes: 0 -> n & not 0 -> 2n becoz I only need 0->n indexes to insert in ans[].
            #After poping elements from stack using above while loop check if stack is not empty
            #If both these are true, then only add stack's top to ans[]
            if stack and i < len(nums):
                ans[i] = stack[-1]
            
            stack.append(nums[i%n])

        return ans
                    





        