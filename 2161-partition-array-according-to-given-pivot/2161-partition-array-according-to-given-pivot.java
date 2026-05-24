class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] temp = new int[n];
        int x = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] < pivot){
                temp[x++] = nums[i];
            }
        }

        for(int i = 0; i < n; i++){
            if(nums[i] == pivot){
                temp[x++] = nums[i];
            }
        }

        for(int i = 0; i < n; i++){
            if(nums[i] > pivot){
                temp[x++] = nums[i];
            }
        }

        return temp;
    }
}