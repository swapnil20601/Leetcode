class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        if(arr.length < 3){
            return -1;
        }
        
        int low = 0;
        int high = arr.length-1; 
        
        
        while(low <= high){
            int mid = (high - low)/2 + low;
            
            if(mid == 0){
                if(arr[mid] > arr[1]){
                    return mid;
                }
                else{
                    return 1;
                }
            }
            else if(mid == arr.length-1){
                if(arr[mid] > arr[arr.length-2]){
                   return mid; 
                }
                else {
                    return arr.length-2;
                }
            }
            
            else {
                 if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                    return mid;
                }
                else if(arr[mid] > arr[mid-1]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        
        return -1;
    }
}