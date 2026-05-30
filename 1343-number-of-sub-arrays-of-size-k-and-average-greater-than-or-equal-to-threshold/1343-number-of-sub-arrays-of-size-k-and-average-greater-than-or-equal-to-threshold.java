class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int n = arr.length;

        for(int i = 0; i <= n-k; i++){
            int currSum = 0;
            for(int j = i; j < i+k; j++){
                currSum += arr[j];
            }
            if(currSum/k >= threshold){
                count++;
            }
        }

        return count;
    }
}