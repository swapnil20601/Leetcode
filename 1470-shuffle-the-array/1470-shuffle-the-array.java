class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int s = 0, i = 0, e = n;
            
        while( s < n && e < nums.length){
            ans[i++] = nums[s++];
            ans[i++] = nums[e++];
        }
        
        return ans;
    }
}