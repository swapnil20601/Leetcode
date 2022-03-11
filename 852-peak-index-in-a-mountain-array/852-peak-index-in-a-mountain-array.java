class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        if(arr.length < 3){
            return -1;
        }
        
        int low = 0;
        int high = arr.length-1; 
        
        
        while(low <= high){
            int mid = (high - low)/2 + low;
            
            if(mid > 0 && mid < arr.length-1) {
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
            
            //here if it was while(low <= high) then we wud have get error bcoz we need atlest 2 2elemnst to compare arr[i] & arr[i+1].
            //becoz lets say there was only 1 element & both high low are pointing to it, then how will u compare arr[mid] > arr[1] ? 
            //we will get indexoutof bound exception here
            else if(mid == 0){
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
           
        }
        
        return -1;
    }
}