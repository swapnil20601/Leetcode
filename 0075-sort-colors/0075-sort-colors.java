class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int zeros = 0, ones = 0, twos = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                zeros++;
            }
            else if(nums[i] == 1){
                ones++;
            }
            else{
                twos++;
            }
        }

        //copy back count of 0s, 1s & 2s to original nums[]
        int x = 0;
        for(int j = 0; j < zeros; j++){
            nums[x++] = 0;
        }

        for(int j = 0; j < ones; j++){
            nums[x++] = 1;
        }

        for(int j = 0; j < twos; j++){
            nums[x++] = 2;
        }
    }
}