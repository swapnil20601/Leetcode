class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        ArrayList<Integer> currRow;
        ArrayList<Integer> prevRow = null;
        
        for(int row = 0; row < numRows; row++){
            currRow = new ArrayList<Integer>();
            for(int col = 0; col <= row; col++){
                if(col == 0 || row == col){
                    currRow.add(1);
                }
                else {
                    currRow.add(prevRow.get(col-1) + prevRow.get(col));
                }
            }
            result.add(currRow);
            prevRow = currRow;
        }
        
        return result;
    }
}