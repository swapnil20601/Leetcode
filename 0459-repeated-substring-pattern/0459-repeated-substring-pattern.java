class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for(int i = n/2; i >= 1; i--){
            if(n % i == 0){
                StringBuilder text = new StringBuilder();
                int times = n / i;
                String pattern = s.substring(0,i);
                for(int j = 1; j <= times; j++){
                    text.append(pattern);
                }
                if(s.equals(text.toString())){
                    return true;
                }
            }
        }
        return false;
    }
}