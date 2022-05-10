**Brute Force
TC = O(N*N)
SC = O(1)**
​
public int firstUniqChar(String s) {
boolean isRepeating;
​
if(s.length() == 0 || s == null){
return -1;
}
​
for(int i = 0; i < s.length(); i++){
isRepeating = false;
for(int j = 0; j < s.length(); j++){
if(i !=j && s.charAt(i) == s.charAt(j)){
isRepeating = true;
break;
}
}
​
if(!isRepeating){
return i;
}
}
​
return -1;
}
​
Algo:
1. Go through each character and see if appears more than 1
2. Make sure while comapring chars, do not compare chars at same index other wise it will be treated as repeating and you will wrong ans
​
----------------------------------------------------------------------------------------
**Better approach: USing HashMAp or freq array**
TC= O(N)
SC= O(1)
​
*Algo:
1. create freq array and add freq of each character in it
2. Iterate throuh string s again and check the freq of each chacater
3. If the frequency of char is less than 2, then return i*
​
​
​