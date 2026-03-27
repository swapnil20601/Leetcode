class Solution {
    public int maxArea(int[] height) {
        int area = -1;
        int left = 0, right = height.length - 1;
        while(left < right){
            int len = Math.min(height[left], height[right]);
            int width = right - left;
            area = Math.max(area, len * width);
            if(height[left] > height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return area;
    }
}