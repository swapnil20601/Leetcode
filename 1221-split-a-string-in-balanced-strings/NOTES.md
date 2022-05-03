***Time & Space in both approaches is O(N) & O(1), Only the ways of impl is different***
​
**Approach 1: Using 2 pointers**
*1. If you find R, then incremnt right-counter by 1
2. If you find L, then incremnt left-counter by 1
3. If both right & lef counter are same then it means we found 1 balanced string.
So incremnt balanced-count by 1*