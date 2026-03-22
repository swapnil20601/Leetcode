class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int low = 0, high = queries.length-1;
        int result = -1;

        if(checkAllZeros(nums)){
            return 0;
        }

        while(low <= high){
            int mid = low + (high-low)/2;
            boolean isZeroArray = checkDifferenceArray(nums, queries, mid);
            if(isZeroArray){
                result = mid+1;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return result;
    }

    private boolean checkDifferenceArray(int[] nums, int[][] queries, int k){
        int len = nums.length;
        int[] diff_array = new int[len];
        
        for(int i = 0; i <= k; i++){
            int left = queries[i][0];
            int right = queries[i][1];
            int x = queries[i][2];

            diff_array[left] += x;
            if(right+1 < len){
                diff_array[right+1] -= x;
            }
        }

        if(nums[0] > diff_array[0]){
            return false;
        }
        
        for(int i = 1; i < len; i++){
            diff_array[i] += diff_array[i-1];
            if(nums[i] > diff_array[i]){
                return false;
            }
        }

        return true;
    }

    private boolean checkAllZeros(int[] nums){
        for(int val : nums){
            if(val != 0){
                return false;
            }
        }
        return true;
    }
}