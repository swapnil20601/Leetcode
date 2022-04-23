**Approach 1:**
Set<Character> set = new HashSet<>();
for(char c: sentence.toCharArray()){
set.add(c);
}
return set.size() == 26;
TC = O(N)
SC= O(1) coz at any given point of time set cannot have more than 26 lenthg
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
TC = O(N)
SC= O(1) coz at any given point of time set cannot have more than 26 lenthg
**Approach 3: Using indexOf()**
for(int i = 0; i < 26; i++){
char letter = (char)(i+97);
if(sentence.indexOf(letter) < 0){
return false;
}
}
return true;
TC = O(N)
SC= O(1) coz at any given point of time set cannot have more than 26 lenthg