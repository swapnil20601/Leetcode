class Solution {
    public int arrangeCoins(int n) {
        int i = 1;
        while(n >= 0){
            if(n < i){
                return i-1;
            }
            n -= i;
            i++;
        }
        return -1;
    }
}