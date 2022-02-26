**Approach 1:**
Set<Character> set = new HashSet<>();
for(char c: sentence.toCharArray()){
set.add(c);
}
return set.size() == 26;