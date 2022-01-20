class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int x = 0, y = n;
        
        for(int i = 0; i < ans.length; i=i+2){
            ans[i] = nums[x];
            ans[i+1] = nums[y];
            x++;
            y++;
        }
        return ans;
    }
}