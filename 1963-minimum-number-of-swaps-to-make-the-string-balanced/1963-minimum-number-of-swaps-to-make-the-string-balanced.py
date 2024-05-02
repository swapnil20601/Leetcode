class Solution:
    def minSwaps(self, s: str) -> int:
        #If len of s is odd, then impossible to make pairs
        if len(s) & 1:
            return -1
        
        stack = []
        for ch in s:
            if ch == '[':
                stack.append(ch)
            else:
                if stack and stack[-1] == '[':
                    stack.pop()
                else:
                    stack.append(ch)

        open = len(stack)//2

        if open & 1:
            return (open//2) + 1
        else:
            return open//2

        

        