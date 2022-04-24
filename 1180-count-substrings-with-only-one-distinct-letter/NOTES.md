**Approach 1: Using extra array to keep track of previous character frequency**
public int countLetters(String s) {
if(s.length() == 0 || s == null){
return 0;
}
int total = 1;
int[] substring_freqy = new int[s.length()];
substring_freqy[0] = 1;
for(int i = 1; i < s.length(); i++){
if(s.charAt(i) == s.charAt(i-1)){
substring_freqy[i] = substring_freqy[i-1] + 1;
}
else {
substring_freqy[i] = 1;
}
total += substring_freqy[i];
}
return total;
}
​
TC: O(N)
SC: O(N)
​
​
**Approach 2: Using a viable to keep track of count instead of extra array:**
​
public int countLetters(String s) {
int count = 1;
int total = 1;
for(int i = 1; i < s.length(); i++){
if(s.charAt(i) == s.charAt(i-1)){
count++;
}
else {
count = 1;
}
total += count;
}
return total;
}
TC = O(N)
SC= O(1)