class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = Integer.MIN_VALUE;
        
        for(String str: sentences) {
            /*
            
            String[] words = str.split(" ");
            ans = Math.max(ans, words.length);
            
            */
            
            //The following code can be written is 2 lines as above.
            // Since split() returns array of strings based on delimiter; th
            // count of words in a sentences = length of array returned after   using split
            ans = Math.max(ans, str.split(" ").length);
        }
        
        return ans;
    }
}