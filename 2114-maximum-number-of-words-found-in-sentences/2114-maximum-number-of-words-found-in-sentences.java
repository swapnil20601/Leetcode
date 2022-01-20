class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = Integer.MIN_VALUE;
        
        for(String str: sentences) {
            int count = 1;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == ' '){
                    count++;
                }
            }
            ans = Math.max(ans, count);
        }
        
        return ans;
    }
}