class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int[] temp = new int[nums.length];
        int index = 0;
        for(int i = nums.length-k; i < nums.length; i++){
            temp[index] = nums[i];
            index++;
        }

        for(int i = 0; i < nums.length-k; i++){
            temp[index] = nums[i];
            index++;
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = temp[i];
        }
    }
}