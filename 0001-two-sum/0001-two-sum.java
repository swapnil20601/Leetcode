class Solution {
    public int[] twoSum(int[] nums, int target) {


        //Better: Sorting & 2-ptr => TC: O(n log n) & SC = O(1)
        //But this will give incorrect ouput because after sorting array, the indices will change




        //Optimal: HashMap  => TC: O(N) & SC = O(N)
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = target - nums[i];
            if(map.containsKey(num)){
                return new int[]{map.get(num),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
