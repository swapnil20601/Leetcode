class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans = 0;
        int n = nums.length;
        int zeros = 0;
        int i = 0, j = 0;

        while(j < n){
            if(nums[j] == 0){
                zeros++;
            }
            //Valid condition. So capture ans/window
            if(zeros <= k){
                ans = Math.max(ans, j-i+1);
            }
            //This means invalid condititon. So shrink window
            else{
                if(nums[i] == 0){
                    zeros--;
                }
                i++;
            }
            j++;
        }
        
        return ans;
    }
}