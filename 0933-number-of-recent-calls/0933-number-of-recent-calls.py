class RecentCounter:
    def __init__(self):
        self.Q = deque()
        

    def ping(self, t: int) -> int:
        #Step 1: Push t in Q
        self.Q.append(t)

        #Step 2: Check if Q contains valid no. of requests that lie in range [t-3000,t]. If yes, then dont do anything.
        #If no, then pop that many requests
        while self.Q[0] < (t-3000):
            self.Q.popleft()
        
        #Step 3: Return size of Q
        return len(self.Q)

        


# Your RecentCounter object will be instantiated and called as such:
# obj = RecentCounter()
# param_1 = obj.ping(t)