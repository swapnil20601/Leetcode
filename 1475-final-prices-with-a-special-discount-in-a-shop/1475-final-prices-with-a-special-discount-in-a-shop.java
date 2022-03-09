class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stk = new Stack<>();
        for(int i = 0; i < prices.length; i++){
            while(!stk.empty() && prices[i] <= prices[stk.peek()]){
                prices[stk.peek()] = prices[stk.peek()] - prices[i];
                stk.pop();
            }
            stk.push(i);
        }
        return prices;
    }
}