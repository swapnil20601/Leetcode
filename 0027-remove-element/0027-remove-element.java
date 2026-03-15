class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0, n = nums.length;
        if(n == 0){
            return 0;
        }

        if(n == 1 && val == nums[0]){
            return 0;
        }

        for(int i = 0; i < n; i++){
            if(nums[i] != val){
                int temp = nums[i];
                nums[j++] = nums[i];
                nums[i] = temp;
            }
        }
        return j;
    }
}