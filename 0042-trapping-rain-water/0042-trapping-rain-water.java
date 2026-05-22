class Solution {
    public int trap(int[] height) {
        int water = 0;
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        int left = 0;
        for(int i = 0; i < n; i++){
            left = Math.max(left,height[i]);
            leftMax[i] = left;
        }

        int right = 0;
        for(int i = n-1; i >= 0; i--){
            right = Math.max(right,height[i]);
            rightMax[i] = right;
        }

        for(int i = 0; i < n; i++){
            water += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return water;
    }
}