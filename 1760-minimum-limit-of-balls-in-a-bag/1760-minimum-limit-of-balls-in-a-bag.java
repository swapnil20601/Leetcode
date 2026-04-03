class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        int ans = -1;
        for(int val : nums){
            high = Math.max(high,val);
        }

        while(low <= high){
            int mid = low+(high-low)/2;
            if(isPossible(nums,maxOperations,mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    private boolean isPossible(int[] arr, int maxOps, int penalty){
        long totalOps = 0;
        for(int val : arr){
            int ops = val/penalty;
            if(val % penalty == 0){
                ops--;
            }
            totalOps += ops;
        }
        return totalOps <= maxOps;
    }
}