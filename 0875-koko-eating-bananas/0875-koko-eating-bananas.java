class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high = piles[0];
        int low = 1;
        int ans = -1;

        for(int pile : piles){
            high = Math.max(pile, high);
        }

        while(low <= high){
            int mid = low + (high-low)/2;
            if(isPossible(piles, mid, h)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }


        return ans;
    }

    private boolean isPossible(int[] piles, int i, int h){
        long hours = 0L;
        for(int pile : piles){                 
            hours += (pile / i);
            if((pile % i) != 0){
                hours++;
            }
        }
        return hours <= h;
    }
}