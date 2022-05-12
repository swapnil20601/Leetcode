**Using normal simulation**
*Algo:
1) If num is even, divide by & increment step
2) If num is odd, subtract 1 from num & increment step
3) Keep doing this until num > 0*
​
**TC= O(log n) --> becoz we are diving num by 2 at every step. Even if its odd, we do -1 to make it even & again divide by 2. So it means we are halving no after every 2 steps
SC = O(1)**
​
public int numberOfSteps(int num) {
int steps = 0;
​
while(num > 0){
if(num % 2 == 0){
num = num/2;
}
else{
num -= 1;
}
steps++;
}
​
return steps;
}
​
----------------------------------------------------------------------
​
**Using bitwise operator**
TC & SC is same as above. Only way of impleneting is different