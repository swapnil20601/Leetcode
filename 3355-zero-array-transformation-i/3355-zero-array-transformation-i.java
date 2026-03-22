class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] difference_array = new int[n];

        for(int[] arr : queries){
            int left = arr[0];
            int right = arr[1];
            difference_array[left] += 1;
            if(right + 1 < n){
                difference_array[right+1] -= 1;
            }
        }

        for(int i = 1; i < n; i++){
            difference_array[i] += difference_array[i-1];
        }

        for(int i = 0; i < n; i++){
            if(difference_array[i] < nums[i]){
                return false;
            }
        }

        return true;
    }
}