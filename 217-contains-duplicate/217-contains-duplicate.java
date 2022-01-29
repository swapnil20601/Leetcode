class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int item : nums) {
            if(map.containsKey(item)){
                return true;
            }
            map.put(item, map.getOrDefault(1, 0 + 1));
        }

        return false;
    }
}