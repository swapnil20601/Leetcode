class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);  
        long res = 0L;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int leftIdx = lower_bound(nums,i+1,n-1,lower - nums[i]);// Find the first element not less than (lower - nums[i])
            int x = leftIdx - i - 1;

            int rightIdx = upper_bound(nums,i+1,n-1,upper - nums[i]);// Find the first element greater than (upper - nums[i])
            int y = rightIdx - i - 1;
            res += (y-x);
        }
        return res;
    }

    private int lower_bound(int[] arr, int low, int high, int target){
        int index = arr.length;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid] <  target){
                low = mid+1;
            }
            else{
                index = mid;
                high = mid-1;
            }
        }
        return index;
    }

    private int upper_bound(int[] arr, int low, int high, int target){
        int index = arr.length;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid] >  target){
                index = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return index;
    }
}