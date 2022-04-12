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