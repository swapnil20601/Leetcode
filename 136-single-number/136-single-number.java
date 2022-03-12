class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        
        int i = 0; int j = 1;int ans = -1;
        while(i < nums.length && j < nums.length){
            if(nums[i] != nums[j]){
                return nums[i];
            }
            else {
                i = j+1;
                j = i+1;
            }
        }
        
        if(i < nums.length){
            ans = nums[i];
        }
        return ans;
    }
}
//Check notes for all possible solutions