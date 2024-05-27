class MyQueue:

    def __init__(self):
        self.S1 = []
        self.S2 = []
        

    def push(self, x: int) -> None:
        self.S1.append(x)

    def pop(self) -> int:
        #if s2 is empty, transfer all elemenst from s1 -> s2 & then pop from S2
        if not self.S2:
            while self.S1:
                self.S2.append(self.S1.pop())
        #Otherseise directly pop from S2
        return self.S2.pop()


        

    def peek(self) -> int:
        #if s2 is empty, transfer all elemenst from s1 -> s2 & return S2 ka top
        if not self.S2:
            while self.S1:
                self.S2.append(self.S1.pop())
        #Otherseise just return S2 ka top
        return self.S2[-1]

        
    def empty(self) -> bool:
        return not self.S1 and not self.S2
        


# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()