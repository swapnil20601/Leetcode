class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> s = new Stack<>();

        for(int i = 2*n-1; i >= 0; i--){
            int index = i % n;
            while(!s.isEmpty() && nums[index] >= nums[s.peek()]){
                s.pop();
            }

            res[index] = s.isEmpty() ? -1 : nums[s.peek()];
            s.push(index);
        }
        return res;
    }
}

