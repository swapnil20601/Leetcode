Map<Integer, Integer> map = new HashMap<>();
int pairs = 0;
for(int ele: nums){
if(map.containsKey(ele-k)){
pairs += map.get(ele-k);
}
if(map.containsKey(ele+k)){
pairs += map.get(ele+k);
}
map.put(ele, map.getOrDefault(ele,0)+1);
}
return pairs;