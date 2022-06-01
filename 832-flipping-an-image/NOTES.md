SC = O(1)
**Arroach 2:**
The idea is simple. For each row, use two pointers. One is going forward and the other is going backward.
(1). If the two elements are the same, then only we will invert it, i. e, 1 --> 0 or 0--> 1
(2) Otherwise we dont do anything. Move to next iteration
​
We will inevrt the values if two ele are same by using XOR operator becoz we know
1 ^ 0 = 1 else if both bits are same then its 0
​
TC = O(N*M)
SC = O(1)
​
public int[][] flipAndInvertImage(int[][] A) {
for (int i = 0; i < A.length; i++) {
int lo = 0, hi = A[0].length - 1;
while (lo <= hi) {
if (A[i][lo] == A[i][hi]) {
A[i][lo] = 1 - A[i][lo];
A[i][hi] = A[i][lo];
}
lo++;
hi--;
}
}
return A;
}