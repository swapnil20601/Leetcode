class Solution {
    public int minimumSum(int num) {
        //Covert number to String & create char[] out of it so that you can sort array
        char[] ch = String.valueOf(num).toCharArray();
        
        Arrays.sort(ch);
        
        //Convert 0th & 2nd char to int and Integer.parseInt() takes only String arg, we convert those 2 chars into String
        int num1 = Integer.parseInt(""+ch[0] + ch[2]);
        
        //Slly, Convert 1stth & 3rd char to int and convert those 2 chars into String
        int num2 = Integer.parseInt(""+ch[1] + ch[3]);
        
        return num1 + num2;
        
    }
}