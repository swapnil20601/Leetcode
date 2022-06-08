class Solution {
    public int sumOfDigits(int[] nums) {
        int minVal = Integer.MAX_VALUE;
        int sum = 0;
        
        for(int num: nums){
            minVal = Math.min(minVal, num);
        }
        
        
        while(minVal > 0){
            sum += minVal % 10;
            minVal /= 10;
        }
        
        return 1 - sum%2;
    }
}