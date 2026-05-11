class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        int sum = 0;

        while(i >= 0 || j >= 0){
            int a = (i < 0) ? 0 : num1.charAt(i) - '0';
            int b = (j < 0) ? 0 : num2.charAt(j) - '0';
            sum = a+b+carry;
            carry = sum / 10;
            res.append(sum % 10);
            j--;
            i--;
        }

        if(carry > 0){
            res.append(carry);
        }

        return res.reverse().toString();
    }
}