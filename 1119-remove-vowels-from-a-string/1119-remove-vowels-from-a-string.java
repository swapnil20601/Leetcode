class Solution {
    public String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()){
            if(c != 'a' && c != 'e' && c!= 'i' && c != 'o' && c != 'u'){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

// Checkout this solution where you do not use extra space: https://leetcode.com/problems/remove-vowels-from-a-string/discuss/452476/Java-StringBuffer-0ms-with-written-approach-to-answering-in-interview. 
//Also check the solution how its implemneted in 1st comment of this soln
// Basically whenver possible use StringBuffer