**Appraoch 1: Using boolean array to mark as visited**
​
public boolean checkValid(int[][] matrix) {
int n = matrix.length;
​
for(int r = 0; r < n; r++){
boolean[] rowVisited = new boolean[n+1];
boolean[] colVisited = new boolean[n+1];
​
for(int c = 0; c < n; c++){
int rowVal = matrix[r][c];
int colVal = matrix[c][r];
​
if(rowVisited[rowVal] == true || colVisited[colVal] == true){
return false;
}
​
rowVisited[rowVal] = true;
colVisited[colVal] = true;
}
}
​
return true;
}
​
**Approach 2: USing HashSet to keep track of only unique elemenst**
​
​