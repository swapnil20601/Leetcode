class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        
        for(int i = len - 1; i >=0 ;i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            
            digits[i] = 0;
        }
        
        //this will happen only in case if given digits[] = [9]. Otherwise all cases will be handled 
        int[] newDigit = new int[len+1];
        newDigit[0] = 1;
        return newDigit;
    }
}