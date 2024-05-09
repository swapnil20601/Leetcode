class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        fleet = 0
        cars = []
        n = len(position)

        for i in range(n):
            cars.append([position[i], (target - position[i]) / speed[i]])

        cars.sort(key=lambda x: x[0])

        for i in range(n-1,0,-1):
            car1_time = cars[i][1]
            car2_time = cars[i-1][1]
            if car2_time <= car1_time:
                cars[i-1][1] = cars[i][1]
            else:
                fleet += 1

        fleet += 1
        
        return fleet