class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int k = 0;
        int[] res = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                res[k++] = nums[i];
            }
        }
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 != 0){
                res[k++] = nums[i];
            }
        }
        
        return res;
    }
}