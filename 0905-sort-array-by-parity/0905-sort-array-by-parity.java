class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int even = 0, odd = n-1;
        for(int i = 0; i < n ; i++){
            if((nums[i] & 1) == 0){
                temp[even++] = nums[i];
            }
            else{
                temp[odd--] = nums[i];
            }
        }

        return temp;
    }
}