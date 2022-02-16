class Solution {
    public String toLowerCase(String s) {
        char[] res = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
           
            res[i] = (res[i] >= 65 && res[i] <= 90) ? (char)(res[i] + 32) : res[i];
        }
        return String.valueOf(res);
    }
}

//try with hashmap