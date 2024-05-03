class Solution:
    def simplifyPath(self, path: str) -> str:
        tokens = path.split('/')
        stack=[]

        
        for token in tokens:
            if token == '' or token =='.':
                continue
            elif token != '..':
                stack.append(token)
            else:
                if stack:
                    stack.pop()

        return '/'+'/'.join(stack)
        