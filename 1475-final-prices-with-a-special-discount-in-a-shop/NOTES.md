**Brute force
TC = O(N^2)
SC= O(N)**
​
public int[] finalPrices(int[] prices) {
for(int i = 0; i < prices.length-1; i++){
for(int j= i+1; j < prices.length; j++){
if(prices[j] <= prices[i]){
prices[i] = prices[i] - prices[j];
break;
}
}
}
return prices;
}
----------------------------------------------------------------
**Apporach 2: USing Monotonic stack**
**TC= O(N)
SC=O(N)**
​
Stack<Integer> stk = new Stack<>();
for(int i = 0; i < prices.length; i++){
while(!stk.empty() && prices[i] <= prices[stk.peek()]){
prices[stk.peek()] = prices[stk.peek()] - prices[i];
stk.pop();
}
stk.push(i);
}
return prices;
--------------------------------------------------------------------------
​