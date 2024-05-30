class Solution:
    def deckRevealedIncreasing(self, deck: List[int]) -> List[int]:
        n = len(deck)
        res = [0] * n
        deck.sort()
        i,x = 0,0
        skip = False

        while i < n:
            if res[x] == 0:
                if not skip:
                    res[x] = deck[i]
                    i += 1
                    skip = True
                else:
                    skip = False

            x = (x+1) % n

        return res
            

        