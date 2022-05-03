**Brute Force**
​
For understanding soln see: https://leetcode.com/problems/create-target-array-in-the-given-order/discuss/547559/CJava-solution-(shift-numbers-when-needed)
​
TC: O(N^2)
SC: O(1)
public int[] createTargetArray(int[] nums, int[] index) {
int[] target = new int[index.length];
int j = 0;
for(int i = 0; i < index.length; i++){
int idx = index[i];
if(idx < i){
j = i;
while(j > idx){
target[j] = target[j-1];
j--;
}
}
target[idx] = nums[i];
}
return target;
}
**Optimized: USing ArrayList**
​
*Algo:
1. Create Arraylist & Put all nums[i] at given index[i] in arraylist
2. Create target array & put all elements from list into target array
TC: O(N)
SC: O(N) --> for creating Arraylist*
​