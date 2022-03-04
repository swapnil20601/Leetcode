**Converting number to char array**
​
String str = String.valueOf(n);
int len = str.length();
int res = 0;
​
for(char c : str.toCharArray()){
res += Math.pow((int)(c - '0'), len);
}
return res == n;
​
​