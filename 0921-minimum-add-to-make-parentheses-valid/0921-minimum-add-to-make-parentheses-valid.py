class Solution:
    def minAddToMakeValid(self, s: str) -> int:
        stack = []
        count = 0
        for char in s:
            #If ( --> Push & count++ 
            if char == '(':
                stack.append(char)
                count += 1
            #If )  ---> 1st check if stack is empty or not?
            else:
                #If stack is not empty --> pop & count--
                if stack:
                    stack.pop()
                    count -= 1
                #If stack is empty ---> We need equivalent ( to form a pair with ). So count++
                else:
                    count += 1
        return count
        