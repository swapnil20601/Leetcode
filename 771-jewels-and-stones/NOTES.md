**Using HashSet**
​
public int numJewelsInStones(String jewels, String stones) {
int count = 0;
Set<Character> set = new HashSet<>();
for(char j : jewels.toCharArray()){
set.add(j);
}
for(char s:stones.toCharArray()){
if(set.contains(s)){
count++;
}
}
return count;
}
SC = O(J) --> Set which stires jewels
TC = O(J+S)
​
**Using Freq Array**
​
public int numJewelsInStones(String jewels, String stones) {
int count = 0;
/*
we create array of 128 size bcoz A-z & a-z characters lies bewteen 65- 122 range.
so we need to use array with size at least = 123
*/
int[] frequency = new int[128];
for(char s : stones.toCharArray()){
frequency[s]++;
}
for(char j :jewels.toCharArray()){
count += frequency[j];
}
return count;
}
​
TC= O(J+S)
SC = O(1) ... 128 is a fixed size array.  So its onsidered as constant space.It does not grow with input size