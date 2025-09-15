class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> tripletSet = new HashSet<>();
        Set<Integer> set = new HashSet<>();

        for(int i = 0;i < n; i++){
            for(int j = i+1; j < n;j++){
                int target = -1*(nums[i] + nums[j]);
                if(set.contains(target)){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(target);
                    Collections.sort(temp);
                    tripletSet.add(temp);
                }
                set.add(nums[j]);
            }
            set.clear();
        }

        List<List<Integer>> res = new ArrayList<>(tripletSet);
        return res;
    }
}