class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        int n1 = nums1.length, n2 = nums2.length;

        int[] ans = new int[n1];

        //Returns array of next greater element to right of every element in nums2
        int[] nger = nextGreaterElementRight(nums2);

        //Fill map with key = nums2 element & val = its next greater element to right
        for(int i = 0; i < n2; i++){
            map.put(nums2[i], nger[i]);
        }

        //Fill in ans[] with the appropriate values from hashmap
        for(int i = 0; i < n1; i++){
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }

    private int[] nextGreaterElementRight(int[] arr){
        int n = arr.length;
        int[] res = new int[n];

        //Stack stores indexs and not elements itself. Make it a practice
        Stack<Integer> st = new Stack<>();

        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && arr[i] > arr[st.peek()]){
                st.pop();
            }

            if(st.isEmpty())
                res[i] = -1;
            else
                res[i] = arr[st.peek()];
            
            st.push(i);
        }
        return res;
    }
}