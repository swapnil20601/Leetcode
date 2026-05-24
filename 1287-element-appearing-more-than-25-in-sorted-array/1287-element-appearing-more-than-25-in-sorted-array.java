class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int i = 0;

        while(i < n){
            int count = 1;
            while((i < n-1) && arr[i] == arr[i+1]){
                count++;
                i++;
            }
            if(count > n/4){
                return arr[i];
            }
            i++;
        }
        
        return -1;
    }
}