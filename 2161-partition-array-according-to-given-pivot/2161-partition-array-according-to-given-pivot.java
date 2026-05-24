class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] temp = new int[n];
        int lessThanPivot = 0, equalToPivot = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] < pivot){
                lessThanPivot++;
            }
            else if(nums[i] == pivot){
                equalToPivot++;
            }
        }

        int left = 0, mid = lessThanPivot, right = lessThanPivot + equalToPivot;

        for(int i = 0; i < n; i++){
            if(nums[i] < pivot){
                temp[left++] = nums[i];
            }
            else if(nums[i] == pivot){
                temp[mid++] = nums[i];
            }
            else{
                temp[right++] = nums[i];
            }
        }
        
        return temp;
    }
}