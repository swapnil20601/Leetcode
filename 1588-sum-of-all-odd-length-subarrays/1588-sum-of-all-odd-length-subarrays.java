class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int totalSum = 0;
        int sum = 0;
        int n = arr.length;
        
        for(int i = 0; i < n; i++){  
            sum = 0;
            for(int j = i; j < n; j++){
                sum += arr[j];
                if((j-i+1)% 2 == 1){
                    totalSum += sum;
                }
            }
            
        }
        return totalSum;
    }
}