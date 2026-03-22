class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        while(i < j){
            if(isValidCharacter(s.charAt(i)) && isValidCharacter(s.charAt(j))){
                if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                    return false;
                }
                else{
                    i++;
                    j--;
                }
            }
            if(!isValidCharacter(s.charAt(i))){
                i++;
            }
            if(!isValidCharacter(s.charAt(j))){
                j--;
            }
        }   
        return true;
    }

    private boolean isValidCharacter(char ch){
        return ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'));
    }
}