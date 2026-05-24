class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0, n= nums.length, count = 0;
        for(int i = 0; i < n; i++){
            if(count == 0){
                candidate = nums[i];
            }
            if(nums[i] == candidate){
                count++;
            }
            else{
                count--;
            }
        }
        
        return candidate;
    }
}