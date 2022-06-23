**Brute Force:**
public int numIdenticalPairs(int[] nums) {
int count = 0;
for(int i = 0; i < nums.length - 1;i++){
for(int j = i+1; j < nums.length; j++){
if(nums[i] == nums[j]) count++;
}
}
return count;
}
​
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
public int numIdenticalPairs(int[] nums) {
int count = 0;
Map<Integer, Integer> map = new HashMap<>();
for(int num:nums){
int val = map.getOrDefault(num, 0);
count += val;
map.put(num,val+1);
}
return count;
}