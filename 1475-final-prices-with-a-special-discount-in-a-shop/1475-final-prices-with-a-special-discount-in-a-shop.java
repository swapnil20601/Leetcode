class Solution {
    public int[] finalPrices(int[] prices) {
       Deque<Integer> stk = new  ArrayDeque<>();
        
        for(int i =0 ; i < prices.length; i++){
            while(!stk.isEmpty() && prices[i] <= prices[stk.peek()]){
                prices[stk.peek()] = prices[stk.peek()] - prices[i];
                stk.poll();
            }
            stk.push(i);
        }
        
        return prices;
    }
}