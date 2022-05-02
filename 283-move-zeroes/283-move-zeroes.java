class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0, n = nums.length;
        
        while(i < n && j < n){
            if(nums[i] != 0){
                i++;
                j = i;
            }
            else if(nums[j] == 0){
                j++;
            }
            else {
                 int temp = nums[i];
                 nums[i] = nums[j];
                 nums[j] = temp;
                 i++;
            }
        }
        
    }
}