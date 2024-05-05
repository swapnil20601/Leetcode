class Solution:
    def removeKdigits(self, num: str, k: int) -> str:
        stack = []
        for i in range(len(num)):
            while stack and k > 0 and int(num[i]) < int(stack[-1]):
                stack.pop()
                k -= 1
            
            #To handle suffix 0's. Push in stack only if curr digit is not 0 OR if stack already has some digit2 in it
            #IF stack = [], then dont push
            #If stack = [2] or like [2,0,0], then only push
            #We do tjis in order to remove suffix zeros like ex: 0200
            if stack or num[i] != '0':
                stack.append(num[i])

        #Consider case when num = '1234' & k = 4. Here
        while k > 0 and stack:
            stack.pop()
            k -= 1



        #Corner case:
        #Consider ex: num = "10" & k=1
        if not stack:
            return '0'
        

        return ''.join(stack)

                


            

