class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int window = Integer.MAX_VALUE;
        int n = nums.length;
        int i = 0, j = 0;
        int sum = 0;
        while(j < n){
            sum += nums[j];
            while(sum >= target){
                window = Math.min(window, j-i+1);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        
        return (window == Integer.MAX_VALUE) ? 0 : window;
    }
}