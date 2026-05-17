class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] arr = new int[n];

        for(int[] query : queries){
            int left = query[0];
            int right = query[1];
            arr[left] += 1;
            if(right + 1 < n){
                arr[right+1] -= 1;
            }
        }
 
        if(nums[0] > arr[0]){
            return false;
        }


        for(int i = 1; i < n; i++){
            arr[i] += arr[i-1];
            if(nums[i] > arr[i]){
                return false;
            }
        }

        return true;
    }
}