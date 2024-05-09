class BrowserHistory:

    def __init__(self, homepage: str):
        self.curr = homepage
        self.past = []
        self.future = []
        

    def visit(self, url: str) -> None:
        #1st push curr in past stack
        self.past.append(self.curr)
        self.curr = url
        while self.future:
            self.future.pop()

    def back(self, steps: int) -> str:
        while self.past and steps > 0:
            #1st push curr in future stack
            self.future.append(self.curr)
            self.curr = self.past[-1]
            self.past.pop()
            steps -= 1
        
        return self.curr


    def forward(self, steps: int) -> str:
        while self.future and steps > 0:
            #1st push curr in past stack
            self.past.append(self.curr)
            self.curr = self.future[-1]
            self.future.pop()
            steps -= 1
        return self.curr

        


# Your BrowserHistory object will be instantiated and called as such:
# obj = BrowserHistory(homepage)
# obj.visit(url)
# param_2 = obj.back(steps)
# param_3 = obj.forward(steps)