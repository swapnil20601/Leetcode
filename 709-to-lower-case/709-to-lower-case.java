class Solution {
    public String toLowerCase(String s) {
        String res = "";
        for(int i = 0; i < s.length(); i++){
            /*
            You can use either ternary op or if-else:
            
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                res += (char)(s.charAt(i) + 32);
            }
            else {
                res += s.charAt(i);
            }
            */
            res += (s.charAt(i) >= 65 && s.charAt(i) <= 90) ? (char)(s.charAt(i) + 32) : s.charAt(i);
        }
        return res;
    }
}