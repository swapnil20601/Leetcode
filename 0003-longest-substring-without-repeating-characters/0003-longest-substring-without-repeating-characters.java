class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        int i = 0, j = 0;
        Set<Character> set = new HashSet<>();
        while(j < n){
            char ch = s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                maxLen = Math.max(maxLen, j-i+1);
                j++;
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }

        return maxLen;
    }
}