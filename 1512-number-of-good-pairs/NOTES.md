**Using sorting**
public int numIdenticalPairs(int[] nums) {
Arrays.sort(nums);
int i = 0, j = 1, count = 0;
while(i < nums.length && j < nums.length){
if(nums[i] == nums[j]){
count += j - i;
j++;
}
else {
i = j;
j++;
}
}
return count;
}
**Using frequency array**
​
int count = 0;
int[] freq = new int[101];
​
for(int num: nums){
count += freq[num];
freq[num]++;
}
return count;
**Using HashMap**: