class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] temp = new int[n];
        Arrays.fill(temp, pivot);

        int left = 0, right = n-1;
        int lessThanPivot = 0, greaterThanPivot = n-1;

        while(lessThanPivot < n && greaterThanPivot >= 0){
            if(nums[lessThanPivot] < pivot){
                temp[left++] = nums[lessThanPivot];
            }
            if(nums[greaterThanPivot] > pivot){
                temp[right--] = nums[greaterThanPivot];
            }
            lessThanPivot++;
            greaterThanPivot--;
        }

        return temp;
    }
}