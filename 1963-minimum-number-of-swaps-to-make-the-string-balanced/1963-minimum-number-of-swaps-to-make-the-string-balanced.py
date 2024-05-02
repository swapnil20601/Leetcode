class Solution:
    def minSwaps(self, s: str) -> int:
        #If len of s is odd, then impossible to make pairs
        if len(s) & 1:
            return -1
        
        count = 0
        stack = []
        for ch in s:
            if ch == '[':
                stack.append(ch)
#If ch is closing bracket, then check if stack is not emoty? 
#If it is emoty, then push ]. 
#If it is not emoty, then check if stack's top = opening bracket? If yes, then only pop. This
#is bcoz it is possible that stack's top = closing bracket. Why? -> you must have pushed
#closing bracket when stack was empty
            else:
                if stack and stack[-1] == '[':
                    stack.pop()
                else:
                    stack.append(ch)

        #if stack is not empty, it means there are unbalanced brackets. So count reversals
        # while stack:
        #     s1 = stack.pop()
        #     s2 = stack.pop()
        #     if s1 == s2:
        #         count += 1
        #     else:
        #         count += 2

        totalbrackets = len(stack)
        closedbrackets = totalbrackets//2
        
        return (closedbrackets+1)//2
            

        