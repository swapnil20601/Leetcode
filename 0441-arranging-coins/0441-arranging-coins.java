class Solution {
    public int arrangeCoins(int n) {
        int low = 1;
        int high = n;
        int ans = -1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(isPossible(mid,n)){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }

    private boolean isPossible(int row, int n){
        return (row*(row+1)/2) <= n;
    }
}