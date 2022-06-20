class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();
        
        while(columnNumber > 0){
            char c = (char)('A' + (columnNumber - 1) % 26);
            
            res.append(c);
            
            columnNumber = (columnNumber - 1)/26;
        }
        
        return res.reverse().toString();
    }
}