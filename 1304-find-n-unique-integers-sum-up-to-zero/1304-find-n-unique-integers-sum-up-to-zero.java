class Solution {
    public int[] sumZero(int n) {
        int left = 0, right = n-1, start = 1;
        int[] res= new int[n];
        
        while(left <  right){
            res[left++] = -start;
            res[right--] = start;
            start++;
        }
        
        return res;
    }
}