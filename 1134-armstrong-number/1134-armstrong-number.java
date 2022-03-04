class Solution {
    public boolean isArmstrong(int n) {
        int temp = n;
        int len = 0;
        
        while(temp > 0){
            temp /= 10;
            len++;
        }
        
        return getSumOfDigits(n, len) == n;
    }
    
    private int getSumOfDigits(int num, int size){
        int res = 0;
        
        while(num > 0){
            res += Math.pow(num % 10, size);
            num /= 10;
        }
        return res;
    }
}