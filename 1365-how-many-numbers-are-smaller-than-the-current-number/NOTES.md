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