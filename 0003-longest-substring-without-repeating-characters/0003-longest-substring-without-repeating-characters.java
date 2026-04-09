class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int n = s.length();
        int i = 0, j = 0;
        Set<Character> set = new HashSet<>();
        while(j < n){
            if(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            else{
                ans = Math.max(ans, j-i+1);
                set.add(s.charAt(j));
                j++;
            }
        }

        return ans;
    }
}