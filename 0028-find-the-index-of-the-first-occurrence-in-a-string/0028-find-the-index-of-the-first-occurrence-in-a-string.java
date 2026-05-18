class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        //int i = 0, j = 0;

        //if len of needle > len of haystack, then you can never find needle in haystack
        if(n > m) return -1;
        
        for(int i = 0; i < m; i++){
            int k = i;
            int j = 0;
            while(j < n && k < m && haystack.charAt(k) == needle.charAt(j)){
                k++;
                j++;
            }
            if(j == n){
                return i;
            }
        }

        return -1;
    }
}