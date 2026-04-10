class Solution {
    public int characterReplacement(String s, int k) {
        int ans = 0;
        int n = s.length();
        int i = 0, j = 0;
        int maxFreq = 0;
        int diff = 0;

        int[] hash = new int[26];

        while(j < n){
            hash[s.charAt(j)-'A']++;
            maxFreq = Math.max(maxFreq,hash[s.charAt(j)-'A']);

            while((j-i+1) - maxFreq > k){
                hash[s.charAt(i)-'A']--;
                i++;
                maxFreq = 0;
                for(int ele : hash){
                    maxFreq = Math.max(maxFreq,ele);
                }
            }

            ans = Math.max(ans,j-i+1);
            j++;
        }

        return ans;
    }
}