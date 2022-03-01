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
​