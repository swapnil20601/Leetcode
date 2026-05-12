class Solution {
    public int myAtoi(String s) {
        long res = 0;
        boolean neg = false;
        s = s.trim();

        if(s.length() == 0){
            return 0;
        }

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(i == 0){
                if(ch == '-'){
                    neg = true;
                    continue;
                }
                else if( ch == '+'){
                    continue;
                }
            }

            if(ch >= '0' && ch <= '9'){
                int digit = ch - '0';
                res = (res * 10) + digit;
                if(neg){
                    long minVal = -res;
                    if(minVal < Integer.MIN_VALUE){
                        return Integer.MIN_VALUE;
                    }
                }
                else{
                    if(res > Integer.MAX_VALUE){
                        return Integer.MAX_VALUE;
                    }
                }
            }
            else{
                break;
            }
        }

        if(neg){
            res = -res;
        }
        
        return (int)res;
    }
}