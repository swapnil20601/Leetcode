return prices;
}
----------------------------------------------------------------
**Apporach 2: USing Monotonic stack**
**TC= O(N)
SC=O(N)**
​
Deque<Integer> stk = new ArrayDeque<>();
for(int i = 0; i < prices.length; i++){
while(!stk.isEmpty() && prices[i] <= prices[stk.peek()]){
prices[stk.peek()] = prices[stk.peek()] - prices[i];
stk.pop();
}
stk.push(i);
}
​
return prices;
​
--------------------------------------------------------------------------
**If you dont want to modify inpput array, then clone the prices[]. The implenetation is almost same as above**
Deque<Integer> stk = new ArrayDeque<>();
int[] res = prices.clone();
​
for(int i = 0; i < prices.length; i++){
while(!stk.isEmpty() && prices[i] <= prices[stk.peek()]){
res[stk.peek()] = prices[stk.peek()] - prices[i];
stk.pop();
}
stk.push(i);
}
​
return res;
**We used Deque instead of Stack bcoz stack & Queue are slower than ArrayDeque which a class that implements Dequeu interface & alo it is deprecated.**
If u want to see soln video:
https://www.youtube.com/watch?v=3_BAIugNaLw
​