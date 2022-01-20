class Solution {
    public int maximumWealth(int[][] accounts) {
        int res = 0;
        for(int[] account: accounts){
            int sum = 0;
            for(int wealth: account){
                sum += wealth;
            }
            res = Math.max(sum, res);
        }
        return res;
    }
}