class Solution:
    def reverser_string(self,input_str):
        arr = list(reversed(input_str))
        return ''.join(arr)

    def decodeString(self, s: str) -> str:
        stack = []
        for char in s:
            if char == ']':
                res = []
                num = ''
                while stack and not stack[-1].isdigit():
                    poped_item = stack.pop()
                    if poped_item == '[':
                        continue
                    else:
                        res.append(poped_item)
                
                while stack and stack[-1].isdigit():
                    num = num + stack.pop()
                
                rev_num = self.reverser_string(num)
                ans = ''.join(res)
                stack.append(ans*int(rev_num))
            else:
                stack.append(char)

        tokens = []
        for item in stack:
            rev = self.reverser_string(item)
            tokens.append(rev)
            
        return ''.join(tokens)
        