**Brute force approach:**
​
1. Find path from root to Node p & put that path in ArrayList 1.
2. Similarly, find path from root to q & put it in ArrayList 2.
3. Now traverse through both lists using i & j ptrs until both values in AL1 & AL2 are same.
4. The moment you get different values, come out of loop and the last common value in AL1 & AL2 is your ans
​
Ex: In given example 1;
AL1 = [3,5]
AL2 = [3,1]
​
Here 3 is the last common value in both lists. Hence LCA = 3
​
Try to dry run on following tree for all cases
​
1
/  \
2      3
/   \
4       5
/        /  \
8        6     7
Ex 2: In example 2:
AL1 = [3,5]
AL2 = [3,5,2,4]
​
Here 5 is the last common value in both lists. Hence LCA = 5
​
*In case you dont undersatnd optimal solution that is submitted, see: https://www.youtube.com/watch?v=-QHfMDde90*