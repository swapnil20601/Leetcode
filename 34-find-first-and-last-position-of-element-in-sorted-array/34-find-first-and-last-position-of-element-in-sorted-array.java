class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = helper(nums, target, true);
        int second = helper(nums, target, false);
        
        return new int[]{first, second};
    }
    
    private int helper(int[] arr, int target, boolean firstOccurence){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        
        while(start <= end){
            int mid = start + (end-start)/2;
            
            
            if(arr[mid] == target){
                ans = mid;
               if(firstOccurence){
                   end = mid-1;
               }
                else{
                    start = mid+1;
                }
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        
        return ans;
    }
}