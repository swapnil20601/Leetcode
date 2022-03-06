**Approach 1:**
It is very easy to convert a number to a String and then call length method on it. & see if the length of that number is even or odd But this is not what an interviewer would expect from you.
​
**Approach 2: Intuitive soln**
​
public int findNumbers(int[] nums) {
int count = 0;
for(int num : nums){
int digits = getNumberOFDigits(num);
if(digits % 2 == 0){
count++;
}
}
return count;
}
private int getNumberOFDigits(int n){
int digits = 0;
while(n > 0){
digits++;
n /= 10;
}
return digits;
}
TC = O(n * m) where m is the length of each number in array
**Approach 3: Using log**