**Brute Force**
public int[] smallerNumbersThanCurrent(int[] nums) {
int[] res = new int[nums.length];
for (int i = 0; i < nums.length; i++) {
int count = 0;
for (int j = 0; j < nums.length; j++) {
if (i != j && nums[j] < nums[i]) {
count++;
}
}
res[i] = count;
}
​
return res;
}
​
**Using HAshMap**
​
int[] copy = nums.clone();
Map<Integer, Integer> map = new HashMap<>();
Arrays.sort(copy);
for(int i = 0; i < copy.length; i++){
if(!map.containsKey(copy[i])){
map.put(copy[i],i);
}
}
for(int i = 0; i < nums.length; i++){
copy[i] = map.get(nums[i]);
}
return copy;