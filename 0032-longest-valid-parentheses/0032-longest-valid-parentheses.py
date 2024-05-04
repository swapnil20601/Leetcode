class Solution:
    def longestValidParentheses(self, s: str) -> int:
        stack = deque()
        res = -math.inf

        #Step 1
        for i in range(len(s)):
            if s[i] == '(':
                stack.append(i)
            else:
                if stack and s[stack[-1]] == '(':
                    stack.pop()
                else:
                    stack.append(i)
        
        if not stack:
            return len(s)
    
        stack.appendleft(-1)
        stack.append(len(s))

        #Step 2
        for i in range(1,len(stack)):
            diff = stack[i] - stack[i-1] - 1
            res = max(res,diff)
        
        return res



        