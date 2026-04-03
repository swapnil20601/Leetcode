class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = -1;
        int high = 0;
        int ans = 0;
        for(int val : weights){
            low = Math.max(low,val);
        }

        for(int val : weights){
            high += val;
        }

        while(low <= high){
            int mid = low+(high-low)/2;
            if(isPossible(weights,mid,days)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return ans;
    }

    private boolean isPossible(int[] arr, int capacity, int givenDays){
        int days = 1;
        int weight = 0;
        for(int val : arr){
            if(val + weight <= capacity){
                weight += val;
            }
            else{
                days++;
                weight = val;
            }
        }
        return days <= givenDays;
    }
}