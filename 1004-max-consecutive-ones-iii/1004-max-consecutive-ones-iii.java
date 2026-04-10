class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = i; j < n; j++){
                if(nums[j] == 0){
                    count++;
                }

                if(count <= k){
                    ans = Math.max(ans, j-i+1);
                }
                else{
                    break;
                }
            }
        }
        return ans;
    }
}