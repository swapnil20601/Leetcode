class Solution {
    public int numIdenticalPairs(int[] nums) {
        //Using sorting
        Arrays.sort(nums);
        int i = 0, j = 1, count = 0;
        
        while(i < nums.length && j < nums.length){
            if(nums[i] == nums[j]){
                count += j - i;
                j++;
            }
            else {
                i = j;
                j++;
            }
        }
        return count;
    }
}