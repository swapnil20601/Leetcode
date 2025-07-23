class Solution {
    public int removeDuplicates(int[] nums) {
        SortedSet<Integer> ts = new TreeSet<>();
        for(int ele:nums){
            ts.add(ele);
        }

        int len = ts.size();
        int idx = 0;
        for(int ele:ts){
            nums[idx++] = ele;
        }
        return len;
    }
}