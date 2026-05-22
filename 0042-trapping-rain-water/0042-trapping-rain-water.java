class Solution {
    public int trap(int[] height) {
        int water = 0;
        int n = height.length;

        for(int i = 1; i < n-1; i++){
            int leftMax = 0;
            int rightMax = 0;

            for(int j = i; j >= 0; j--){
                leftMax = Math.max(leftMax,height[j]);
            }

            for(int j = i; j < n; j++){
                rightMax = Math.max(rightMax,height[j]);
                if(rightMax >= leftMax){
                    break;
                }
            }

            water += Math.min(leftMax, rightMax) - height[i];
        }

        return water;
    }
}