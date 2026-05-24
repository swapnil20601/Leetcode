class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int low = 0, high = n - 1;
        int mid = low + (high-low)/2;
        return nums[mid];
    }
}