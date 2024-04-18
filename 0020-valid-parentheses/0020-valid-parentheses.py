class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        map = {')':'(', '}':'{', ']':'['}

        for char in s:
            #if char is a closing bracket
            if char in map:
                #if stack is not empty & stack top is a correspoding opening bracket, then pop
                #from stack
                if stack and stack[-1] == map.get(char):
                    stack.pop()
                #Else it means this is invalid case. So return False
                else:
                    return False
            #else it is a opening bracket, then push in tack
            else:
                stack.append(char)
        
        #At the end, if stack is enpty then it means all are valid paremthss. So return True
        #else return False as its nit valid paratheses
        return True if not stack else False