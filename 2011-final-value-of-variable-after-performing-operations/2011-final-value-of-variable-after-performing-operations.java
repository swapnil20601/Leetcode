class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        
        for(String str: operations){
            x = (str.equals("X++") || str.equals("++X")) ? x + 1 : x - 1;
        }
        
        return x;
    }
}