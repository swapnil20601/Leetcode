class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Stack<Integer> stack = new Stack<Integer>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int val : nums2){
            while(!stack.isEmpty() && val > stack.peek()){
                map.put(stack.pop(), val);
            }
            stack.push(val);
        }
        
        while(!stack.isEmpty()){
            map.put(stack.pop(), -1);
        }
        
        for(int i = 0 ; i < nums1.length; i++){
            res[i] = map.get(nums1[i]);
        }
        
        return res;
    }
}

