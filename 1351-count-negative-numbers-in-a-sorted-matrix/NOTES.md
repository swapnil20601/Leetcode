for (int col = n; col >= 0; col--) {
if (grid[row][col] < 0) {
count++;
} else {
break;
}
}
}
return count;
}
​
​
**Optimized: Using given info that rows & colmns are sorted in descending order
**
TC : O(M + N)
Why M+N? Consider case where all nos are +ve then n that case you will only increment row until you reach end of row
If all are -ve, In that case you would only drecrement col until it is ==0. Also if 1 element is -ve, then we do not move to other values in that col cuz we know that they are also going to be -ve. We just move to next row. So in worst case, you would move diagonally like climbing down staircase
​
**SC : O(1)**
​
**Algo:**
1) Start scanning from top right corner. Take 2 pts r & c.
2) r keeps track of rows & c keeps track of columns.
3) If at that point you encounter -ve no, we know that all values below that(in that column below that specific index)
will be all -ve bcoz the colms are sorted in deccreasin order.
4) So we can increment counter that those many values in that column & move to next column in left direction
5) If you encounter +ve no instead of -ve no, then it means all the values of the left direction of that no in that row are also +ve, as rows are sorted in descending order
6) So just move to next row
7) Continue this until you reach last row & 1st colum(given that you are starting from right direction & moving towards left)
​
​
​
public int countNegatives(int[][] grid) {
int m = grid.length;
int n = grid[0].length;
int count = 0;
int row = 0;
int col = n - 1;
​
while (row < m && col >= 0) {
if (grid[row][col] < 0) {
count = count + m - row;
col--;
} else {
row++;
}
}
​
return count;
}