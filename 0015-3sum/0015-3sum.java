class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> hashSet = new HashSet<>();
        for(int i = 0; i < n-1; i++){
            Set<Integer> set = new HashSet<>();
            for(int j = i+1; j < n; j++){
                int target = -(nums[i] + nums[j]);
                if(set.contains(target)){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(target);
                    Collections.sort(temp);
                    hashSet.add(temp);
                }
                set.add(nums[j]);
            }
        }
        List<List<Integer>> res = new ArrayList<>(hashSet);
        return res; 
    }
}