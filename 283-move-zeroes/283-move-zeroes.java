class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        while ( j < n && i < n){
            if(nums[i] != 0){
                i++;
                j = i+1;
            }
            else {
                
                while( j < n && nums[j] == 0){
                    j++;
                }
                
                if(j < n) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                }
            }
        }
    }
}