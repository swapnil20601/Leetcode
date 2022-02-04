class Solution {
     /* 
    Try out for following example:
    int[] arr = {3,5,1,7,4,9,4};
    int[] arr = {3,1,4,8,7,2,5};
    */

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currMin = Integer.MAX_VALUE;

        for (int price : prices) {
            currMin = Math.min(currMin, price);

            int currProfit = price - currMin;

            maxProfit = Math.max(maxProfit, currProfit);
        }

        return maxProfit;
    }
}