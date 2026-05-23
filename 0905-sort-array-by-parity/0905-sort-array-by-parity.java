class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int even = 0;

        for(int i = 0; i < n; i++){
            if((nums[i] & 1) == 0){
                int temp = nums[i];
                nums[i] = nums[even];
                nums[even] = temp;
                even++;
            }
        }

        return nums;
    }
}