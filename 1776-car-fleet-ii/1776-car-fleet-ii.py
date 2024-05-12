class Solution:
    def getCollisionTimes(self, cars: List[List[int]]) -> List[float]:
        n = len(cars)
        ans = [-1] * n
        stack = []

        for i in range(n-1,-1,-1):
            #check if there is any car ahead of current car & if yes, then check if speed of curr car <= speed of front cars?
            #If yes, then it means they will never collide. So pop them stack bcoz we are storing only those cars in stack
            # which will collide
            while stack and cars[i][1] <= cars[stack[-1]][1]:
                stack.pop()
            
            #check if there is car ahead of current car & if yes, then check if collision can happen between these 2 cars.
            #If speed of current car > speed of stack.top's car, then collison will happens
            while stack and cars[i][1] > cars[stack[-1]][1]:
                #Find collision_time between current car & stack.top's car
                collision_time = (cars[stack[-1]][0] - cars[i][0]) / abs(cars[i][1] - cars[stack[-1]][1])
                #Now we check if collision_time of stack.top's car == -1, it means collison abhi tak hua hi nahi. 
                #OR if collision_time of current car <= collision_time of stack.top's car. If yes, then we save  
                #collision_time of current car in answer & break out of loop
                if ans[stack[-1]] == -1 or collision_time <= ans[stack[-1]]:
                    ans[i] = collision_time
                    break
                else:
                    stack.pop()
            
            stack.append(i)

        return ans

            
           

        