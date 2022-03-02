class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
    }
    
    private int helper(int[] nums, int index, int currXOR){
        if(index == nums.length){
            return currXOR;
        }
        
        int include = helper(nums, index + 1, currXOR ^ nums[index]);
        int exclude = helper(nums, index + 1, currXOR);
        return include + exclude;
    }
}