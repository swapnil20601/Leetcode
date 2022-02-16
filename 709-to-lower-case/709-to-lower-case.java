class Solution {
    public String toLowerCase(String s) {
        char[] res = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            if(res[i] >= 65 && res[i] <= 90){
                res[i] = (char)(res[i] + 32);
            }
        }
        return String.valueOf(res);
    }
}

//try with hashmap