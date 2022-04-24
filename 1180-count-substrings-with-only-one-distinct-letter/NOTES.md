**Approach 1: Using extra array to keep track of previous character frequency**
​
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