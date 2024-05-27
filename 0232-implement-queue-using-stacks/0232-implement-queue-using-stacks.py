class MyQueue:

    def __init__(self):
        self.S1 = []
        self.S2 = []
        

    def push(self, x: int) -> None:
        while self.S1:
            self.S2.append(self.S1.pop())
        self.S1.append(x)
        while self.S2:
            self.S1.append(self.S2.pop())
        

    def pop(self) -> int:
        if self.S1:
            return self.S1.pop()
        

    def peek(self) -> int:
        if self.S1:
            return self.S1[-1]
        

    def empty(self) -> bool:
        return not self.S1
        


# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()