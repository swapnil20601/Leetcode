class Solution {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length()-1;
        
        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else{
                boolean l = isPalindrome(s, left+1, right);//check if deletng left character makes s palindrome?
                boolean r = isPalindrome(s, left, right-1);//check if deleting right character makes s palindrome?
                return l || r;
            }
        }
        
        return true;
    }
    
    private boolean isPalindrome(String s, int i, int j){
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