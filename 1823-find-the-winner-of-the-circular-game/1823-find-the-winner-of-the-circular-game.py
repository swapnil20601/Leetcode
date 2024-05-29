class Solution:
    def findTheWinner(self, n: int, k: int) -> int:
        Q = deque()
        for i in range(1,n+1):
            Q.append(i)
        
        while len(Q) > 1:
            for i in range(k-1):
                Q.append(Q.popleft())
            if Q:
                Q.popleft()
            
        return Q[0]

        