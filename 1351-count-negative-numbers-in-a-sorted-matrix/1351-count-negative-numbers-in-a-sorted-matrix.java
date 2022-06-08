class Solution {
    public int countNegatives(int[][] grid) {
        int ans = 0;
        int cols = grid[0].length;
        int lastNeg = cols - 1;//this will keep track of index of 1st -ve ele in last row
        
        for(int row = 0; row < grid.length; row++){
            //check edge cases - if first element is less than 0; then it means all elements in that row are negative. So add thme to ans & move to next row
            if(grid[row][0] < 0){
                ans = ans + cols;
                continue;
            }
            
            //if last element is positive then, it it means there are no negative numbers in a row. So skip that iteration & directly move to next row
            if(grid[row][cols-1] > 0){
                continue;
            }
            
            //if the row contains mix of +ve & -ve nos, then do Binary search to find 1st -ve element & adjust ptrs to find all -ve elements
            int left = 0, right = lastNeg;
            while(left <= right){
                int mid = left + (right - left)/2;
                if(grid[row][mid] < 0 ){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            
            //make left point to lastNeg becoz we know that all elements below that are also -ve as given in question
            // columns are also sorted in descending order. So we need not start from last colm again in next row
            // Now that we have found 1st -ve ele in that row, it means all elements after that will also be -ve.
            //So add those many -ve elements to ans
            
            ans = ans + (cols - left);
            lastNeg = left;
        }
        
        return ans;
    }
}