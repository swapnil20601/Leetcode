class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stk = new Stack<>();
        int[] res = new int[prices.length];
        
        for(int i = 0; i < prices.length; i++){
            while(!stk.empty() && prices[i] <= prices[stk.peek()]){
                res[stk.peek()] = prices[stk.peek()] - prices[i];
                stk.pop();
            }
            stk.push(i);
        }
        
        while(!stk.empty()){
            res[stk.peek()] = prices[stk.peek()];
            stk.pop();
        }
        
        return res;
    }
}