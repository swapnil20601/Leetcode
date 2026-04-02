class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long high = Integer.MAX_VALUE;
        long low = 1;
        long ans = 0;
        for(int t : time){
            high = Math.min(high,t);
        }
        high = high * totalTrips;

        while(low <= high){
            long mid = low + (high-low)/2;
            if(isPossible(time,mid,totalTrips)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return ans;
    }

    public boolean isPossible(int[] time, long i, int totalTrips){
        long sum = 0;
        for(int val : time){
            sum += i/val;
        }
        return sum >= totalTrips;
    }
}