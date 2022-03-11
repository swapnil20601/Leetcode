class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        if(arr.length < 3){
            return -1;
        }
        
        int maxSofar = Integer.MIN_VALUE;
        int maxIndex = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxSofar){
                maxIndex = i;
                maxSofar = arr[i];
            }
        }
        
        return maxIndex;
    }
}