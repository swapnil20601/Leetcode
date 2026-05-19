class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        int i = 0, j = 0;

        //if len of needle > len of haystack, then you can never find needle in haystack
        if(n > m) return -1;

        int[] lps = buildLps(needle);
        
        while(i < m){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;

                if(j == n){
                    return i-j;
                }
            }
            else{
                if(j-1 >= 0){
                    j = lps[j-1];
                } else{
                    i++;
                }
            }
        }

        return -1;
    }

    private int[] buildLps(String s){
        int n = s.length();
        int[] lps = new int[n];
        int len = 0;
        int i = 1;

        while(i < n){
            if(s.charAt(i) == s.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len != 0){
                    len = lps[len-1];
                }
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}