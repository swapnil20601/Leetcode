**For all followng implemenattions: TC = O(N) & SC = O(N)
One way of implementation:**
​
Map<Integer,Integer> map = new HashMap<>();
for(int key : arr){
map.put(key, map.getOrDefault(key,0)+1);
}
​
Set<Integer> set = new HashSet<>(map.values());
return map.size() == set.size();
​
**2nd way of implementation:**
Map<Integer,Integer> map = new HashMap<>();
​
for(int key : arr){
map.put(key, map.getOrDefault(key,0)+1);
}
​
Set<Integer> set = new HashSet<>();
​
for(int val : map.values()){
if(set.contains(val)){
return false;
}
else{
set.add(val);
}
}
​
return true;
​
**3rd way of implementation:**
​