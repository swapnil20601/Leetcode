class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i = 0, j = 0, current_sum = 0, count = 0;
        while(j < arr.length){
            current_sum += arr[j];
            if(j-i+1 == k){
                if(current_sum/k >= threshold) count++;
                current_sum -= arr[i];
                i++;
            }
            j++;
        }
        return count;
    }
}