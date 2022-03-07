**Brute force Approach:**
1. Create extra array res[] of same length as that of nums
2. First iterate over nums[] & fill res[] with all even numbers
3. Then again iterate over nums[] & fill res[] with all odd nos.
4. TC= O(N) & SC = O(N)
​
public int[] sortArrayByParity(int[] nums) {
int k = 0;
int[] res = new int[nums.length];
for(int i = 0; i < nums.length; i++){
if(nums[i] % 2 == 0){
res[k++] = nums[i];
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
​