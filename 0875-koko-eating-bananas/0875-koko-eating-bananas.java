class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high = Integer.MIN_VALUE;
        int low = 1;
        int ans = 0;

        for(int pile : piles){
            high = Math.max(high,pile);
        }

        while(low <= high){
            int mid = low + (high-low)/2;
            if(isPossible(piles,mid,h)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    private boolean isPossible(int[] piles, int i, int h){
        long hours = 0;
        for(int val : piles){
            hours += val/i;
            if(val % i != 0){
                hours += 1;
            }
        }
        return hours <= h;
    }
}