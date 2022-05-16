class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        
        for(int r = 0; r < n; r++){
           Set<Integer> row = new HashSet<>();
           Set<Integer> col = new HashSet<>();
            
            for(int c = 0; c < n; c++){
                int rowVal = matrix[r][c];
                int colVal = matrix[c][r];
                
                if(!row.add(rowVal) || !col.add(colVal)){
                    return false;
                }
                
            }
        }
        
        return true;
    }
}