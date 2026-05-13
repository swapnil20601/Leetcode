class Solution {
    public String longestPalindrome(String s) {
        int startIndex = -1, endIndex = -1;
        int n = s.length();
        int palindromicSubstr = 0;

        if(n <= 1){
            return s;
        }

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(isPalindrome(s.substring(i,j+1))){
                    if(j-i+1 > palindromicSubstr){
                        palindromicSubstr = j-i+1;
                        startIndex = i;
                        endIndex = j+1;
                    }
                }
            }
        }

        return s.substring(startIndex,endIndex);
    }

    private boolean isPalindrome(String s){
        int i = 0, n = s.length(), j = n-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}