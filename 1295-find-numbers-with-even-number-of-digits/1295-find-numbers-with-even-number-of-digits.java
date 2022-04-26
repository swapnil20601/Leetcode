class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
       for(int num:nums){
           int digits = getNumOfDigits(num);
           if(digits % 2 == 0){
               count++;
           }
       }
        
        return count;
    }
    
    public int getNumOfDigits(int number){
        int count = 0;
        while(number > 0){
            count++;
            number /= 10;
        }
        return count;
    }
}