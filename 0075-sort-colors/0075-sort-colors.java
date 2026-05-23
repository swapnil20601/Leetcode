class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int start = 0, curr = 0, end = n-1;

        while(curr <= end){
            if(nums[curr] == 2){
                swap(nums,curr,end);
                end--;
            }
            else if(nums[curr] == 0){
                swap(nums,curr,start);
                start++;
                curr++;
            }
            else{
                curr++;
            }
        }
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}