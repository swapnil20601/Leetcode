class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maximumSum = 0;
        int n = nums.length;
        long currSum = 0;
        int i = 0, j = 0;
        Set<Integer> set = new HashSet<>();
        while(j < n){
            while(set.contains(nums[j])){
                currSum -= nums[i];
                set.remove(nums[i]);
                i++;
            }
            
            currSum += nums[j];
            set.add(nums[j]);

            if(j-i+1==k){
                maximumSum = Math.max(maximumSum, currSum);
                currSum -= nums[i];
                set.remove(nums[i]);
                i++;
            }
            j++;
        }
        return maximumSum;
    }
}