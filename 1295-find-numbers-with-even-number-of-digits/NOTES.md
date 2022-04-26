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
**Approach 3: Optimal**
public int findNumbers(int[] nums) {
int count=0;
for(int i =0 ; i< nums.length; i++){
if((nums[i]>9 && nums[i]<100) || (nums[i]>999 && nums[i]<10000) || nums[i]==100000){
count++;
}
}
return count;
}
**Approach 4: Using log**
int count = 0;
for(int x : nums){
int digits = (int)Math.log10(x) + 1;
if(digits % 2 == 0){
count++;
}
}
return count;
//example (234 log 10 + 1) = ( 2 + 1 ) = 3 - number of digit
// 7539 log 10:
7 * 1000 = 7 * 10 ^ 3
Hence, Taking 1og base 10, we get x = 3
So, 3+1 = 4 number of digits