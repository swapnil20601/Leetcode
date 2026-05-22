class Solution {
    public int trap(int[] height) {
        int water = 0;
        int n = height.length;
        int left = 0;
        int right = n-1;
        int leftMax = height[0];
        int rightMax = height[n-1];

        while(left < right){
            if(leftMax <= rightMax){
                water += Math.min(leftMax, rightMax) - height[left];
                left++;
                leftMax = Math.max(leftMax, height[left]);
            }
            else{
                water += Math.min(leftMax, rightMax) - height[right];
                right--;
                rightMax = Math.max(rightMax, height[right]);
            }
        }

        return water;
    }
}