}
}
for(int i = 0; i < nums.length; i++){
if(nums[i] % 2 != 0){
res[k++] = nums[i];
}
}
return res;
}
-------------------------------------------------------------------
**Aproach 2: 2 pointer **
​
Think  that i keeps track of even nos. **I** will move fwd only if it is even
Slly, j will keep track of odd nos. **J** will move fwd only if  J is odd
​
public int[] sortArrayByParity(int[] nums) {
int i = 0, j = 0, n = nums.length;
while(i < n && j < n){
if(nums[i] % 2 == 0){
i++;
j = i; //we do this bcoz consider test case : nums = [0, 1]. If we dont move j to i ,then it will swap odd & even where odd will come first & then even will come and you will get [1,0] which is wrong
}
else if(nums[j] % 2 != 0){
j++;
}
else {
int temp = nums[i];
nums[i] = nums[j];
nums[j] = temp;
i++;
}
}
return nums;
​
/*
Other way of implementing 2 ptr using for loop
​
public int[] sortArrayByParity(int[] A) {
for (int i = 0, j = 0; j < A.length; j++)
if (A[j] % 2 == 0) { // --> If j is odd then only swap and increment i. J will be incremented on each iteration
int tmp = A[i];