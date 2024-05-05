class Solution:
    def isValid(self, s: str) -> bool:
        if s == '':
            return True
            
        idx = s.find('abc')
        #If abc is found
        if idx != -1:
            t_left = s[0:idx]
            t_right = s[idx+len('abc'):]
            t = t_left + t_right
            return self.isValid(t)
        else:
            return False

        