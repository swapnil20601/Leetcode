class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            int digits = getNumberOFDigits(num);
            if(digits % 2 == 0){
                count++;
            }
        }
        
        return count;
    }
    
    private int getNumberOFDigits(int n){
        int digits = 0;
        
        while(n > 0){
            digits++;
            n /= 10;
        }
        return digits;
    }
}