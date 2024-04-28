class Solution:
    def minRemoveToMakeValid(self, s: str) -> str:
        output = 0
        ans = []
        
        for i in range(len(s)):
            if s[i] >= 'a' and s[i] <= 'z':
                ans.append(s[i])
            elif s[i] == '(':
                output += 1
                ans.append(s[i])
            else:
                if output > 0:
                    output -= 1
                    ans.append(s[i])
    
        
        #Now iterate from right--> left to handle case 3 to remove extra open bracket

        #reset output
        output = 0
        res = [''] * len(ans)

        #yaha galti ki thi
        for i in range(len(ans)-1,-1,-1):
            if ans[i] >= 'a' and ans[i] <= 'z':
                res[i] = ans[i]
            elif ans[i] == ')':
                output += 1
                res[i] = ans[i]
            else:
                if output > 0:
                    output -= 1
                    res[i] = ans[i]

        return ''.join(res)            

                
#First iterate from left--> right to handle case 1 & 2 to remove extra closed bracket

        