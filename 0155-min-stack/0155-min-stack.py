class MinStack:

    def __init__(self):
        self.stack = []
        self.mini = math.inf
        

    def push(self, val: int) -> None:
        #If stack is empty, then just push and update mini
        if not self.stack:
            self.stack.append(val)
            self.mini = val
        #If stack is not emoty, then check if val < mini?
        #If not, then just push and dont update mini. Else
        #push modified val & update mini
        else:
            if val < self.mini:
                modified_val = (2 * val) - self.mini
                self.stack.append(modified_val)
                self.mini = val
            else:
                self.stack.append(val)

        
    def pop(self) -> None:
        if self.stack:
            #check if stack's top is modified val?
            #If yes then rollback to previous mini and then pop.Otherwose directly pop
            if self.stack[-1] < self.mini:
                self.mini = (2 * self.mini) - self.stack[-1]
    
            self.stack.pop()
        

    def top(self) -> int:
        if self.stack:
             #check if stack's top is modified val?
            #If yes then return mini as top ele. Otherwise return whatever is top ele
            if self.stack[-1] < self.mini:
                return self.mini
            else:
                return self.stack[-1]
        
        return -1

    def getMin(self) -> int:
        if self.stack:
            return self.mini


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()