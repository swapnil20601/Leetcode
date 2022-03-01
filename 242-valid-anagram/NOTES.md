**Brute force
TC = O(N log N)
SC = O(N)**
​
char[] s1 = s.toCharArray();
char[] t1 = t.toCharArray();
​
Arrays.sort(s1);
Arrays.sort(t1);
​
return Arrays.equals(s1,t1);
​
**USinh Hashtable**
**TC = O(S) + O(T)
SC  = O(N)**
Map<Character, Integer> map = new HashMap<>();
for(int i = 0; i < s.length(); i++){
map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
}
​
for(int i = 0; i < t.length(); i++){
char key = t.charAt(i);
if(!map.containsKey(key)){
return false;
}
else if(map.get(key) == 1){
map.remove(key);
}
else{
map.put(t.charAt(i), map.get(key)-1);
}
}
​
return map.size() == 0;
​
**USing Frequency Array**:
**TC = O(S) + O(T)
SC  = O(1)**
​