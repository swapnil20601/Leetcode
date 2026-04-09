class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int n = s.length();
        for(int i = 0; i < n; i++){
            Set<Character> set = new HashSet<>();;
            for(int j = i; j < n; j++){
                if(set.contains(s.charAt(j))){
                    break;
                }
                ans = Math.max(ans, j-i+1);
                set.add(s.charAt(j));
            }
        }

        return ans;
    }
}