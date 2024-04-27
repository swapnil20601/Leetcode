class Solution:
    def minRemoveToMakeValid(self, s: str) -> str:
        hash = set()
        stack = []
        out =''
        for i in range(len(s)):
            if s[i] == '(':
                stack.append(i)
            elif s[i] == ')':
                if stack:
                    stack.pop()
                else:
                    hash.add(i)

        #Dry run over ex 1 to understand why we do this
        if stack:
            while stack:
                hash.add(stack.pop())
        
        for i in range(len(s)):
            if i not in hash:
                out += s[i]
        
        return out

        