class Solution {
    public int[] finalPrices(int[] prices) {
        Deque<Integer> stk = new ArrayDeque<>();
        int[] res = prices.clone();
        
        for(int i = 0; i < prices.length; i++){
            while(!stk.isEmpty() && prices[i] <= prices[stk.peek()]){
                res[stk.peek()] = prices[stk.peek()] - prices[i];
                stk.pop();
            }
            stk.push(i);
        }
        
        return res;
    }
}