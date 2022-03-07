**Approach 1: Using Recursion**
TC= O(N)
SC = O(N) --> Stack space
​
​
​
​
------------------------------------------------------------
**Approach 2: Using 2 pointer**
TC= O(N)
SC = O(1)
​
int i = 0, j = s.length-1;
while(i < j){
char temp = s[i];
s[i++] = s[j];
s[j--] = temp;
}