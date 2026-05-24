class Solution {
    public int[] searchRange(int[] nums, int target) {
        int startIndex = getStartingIndex(nums,target);
        int lastIndex = -1;
        if(startIndex != -1){
            lastIndex = getLastIndex(nums,target);
        }

        return new int[]{startIndex, lastIndex};
    }

    private int getStartingIndex(int[] arr, int target){
        int index = -1;
        int low = 0, high = arr.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                index = mid;
                high = mid-1;
            }
            else if(arr[mid] > target){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return index;
    }

    private int getLastIndex(int[] arr, int target){
        int index = -1;
        int low = 0, high = arr.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] <= target){
                index = mid;
                low = mid + 1;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return index;
    }
}