**Approach 1:**
Set<Character> set = new HashSet<>();
for(char c: sentence.toCharArray()){
set.add(c);
}
return set.size() == 26;
**Appraoch 2: Using boolean array**
boolean[] alphabets = new boolean[26];
for(char c : sentence.toCharArray()){
alphabets[c - 97] = true;
}
for(boolean letter: alphabets){
if(!letter){
return false;
}
}
return true;
**Approach 3: Using indexOf()**