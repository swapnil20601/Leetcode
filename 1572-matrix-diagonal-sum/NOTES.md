public int diagonalSum(int[][] mat) {
int sum = 0;
int n = mat.length;
//first find sum of all elements in primary & secondary diagonal
for(int i = 0; i < n; i++){
sum += mat[i][i] + mat[i][n-i-1];
}
//if length of matrix is odd, then remove middle element from total sum
//else, if its is even, then return total sum
if(n%2 == 1){
return sum -= mat[n/2][n/2];
}
else {
return sum;
}
}
TC =  O(N) where N is the length of matrix
SC= O(1)