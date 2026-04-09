class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        /* This check is important for edge case.
        Try the following code without this check on arr = [1,2,3], k = 0 or k = 1.
        You will see that only "i" keeps moving forward & gives IndexOutOfBound error
         */
        if(k <= 1) return 0;

        int ans = 0;
        int n = nums.length;
        int prod = 1;
        int i = 0, j = 0;

        while(j < n){
            prod *= nums[j];
            while(prod >= k){
                prod /= nums[i];
                i++;
            }
            ans = ans + (j-i+1);
            j++;
        }
        
        return ans;
    }
}