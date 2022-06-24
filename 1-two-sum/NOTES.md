​
Methods:
​
1. Brute force -- > TC = O(n*n), SC = O(1)
2. Sorting & 2-ptr technique--->TC = O(n log n) + O(n), , SC = O(1)
3. Using hashtable. TC = O(N)  , SC = O(N)
​
https://www.youtube.com/watch?v=dRUpbt8vHpo&t=3s video covers 1st & 3rd method. We have solved this problem using 2nd method. But optimal is 3rd if space is not a problem. Otherwise its 2nd
​
**Method 2:**
/*
-> FIRST SORT ARRAY
-> Use 2 ptrs i & j to iterate over sorted array.
i wil start from 0 index & j from last index.
1. if nums[i] + nums[j] == tagert, then we gpt pair
2. else if nums[i] + nums[j] < taget,  this means our target is greater. So we have to increase our smallest element to element that is just greater than ith element; so that we are able to reach target
3. Slly, if nums[i] + nums[j] > taget this means our target is samller. Hnece we have to reduce the largest element to the ele that is just smaller than jith ele; so that we are able to reach target
​
4. Continue this until i does not cross j;
*/
***But in this question you cannot use method 2 bcoz, we have to return array of indices as answer. And if you sort the given array, then the position of numbers  will change & hence the indices will change & we will get wrong output.
So the best suited soltuion for this problem is Hashtable.
Suppose the question has asked to to return the aray of pairs(i.e sumbers) that sum to target in output, then we could have used method 2
***
​
Check out **Two Sum II - Input Array Is Sorted** problem which uses sorting & method 2