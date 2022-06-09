class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i = 0; i < arr.length-1; i++){
            int maxVal = -1;
            for(int j = i+1; j < arr.length; j++){
                maxVal = Math.max(maxVal, arr[j]);
            }
            arr[i] = maxVal;
        }
        
        arr[arr.length-1] = -1;
        return arr;
    }
}