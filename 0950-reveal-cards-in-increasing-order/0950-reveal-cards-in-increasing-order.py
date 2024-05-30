class Solution:
    def deckRevealedIncreasing(self, deck: List[int]) -> List[int]:
        n = len(deck)
        deq = deque(range(n))
        res = [0] * n
        deck.sort()
        
        for i in range(n):
            #rule 1
            if deq:
                idx = deq.popleft()
                res[idx] = deck[i]
            
            #Rule 2:
            if deq:
                deq.append(deq.popleft())
        
        return res



            

        