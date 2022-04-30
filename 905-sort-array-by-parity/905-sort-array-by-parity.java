class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int curr = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i]%2 == 0){
                res[curr++] = nums[i];
            }
        }
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i]%2 == 1){
                res[curr++] = nums[i];
            }
        }
        return res;
    }
}