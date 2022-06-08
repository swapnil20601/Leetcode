class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int m = grid.length;
        
        for(int row = 0; row < m ; row++){
            int n = grid[row].length - 1;
            for(int col = n; col >= 0 ; col--){
                if(grid[row][col] < 0){
                    count++;
                }
                else {
                    break;
                }
            }
        }
        return count;
    }
}