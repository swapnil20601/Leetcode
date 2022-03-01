}
-----------------------------------------------------------------------------
**Brute Force APP where TC = O(N^2). Idea is to use prefix sum instead of  calling getSubArraySum() that calculayes sum of all elements in that specific subarray again**
int totalSum = 0;
int n = arr.length;
for(int i = 0; i < n; i++){
int sum = 0;
for(int j = i; j < n; j++){
sum += arr[j];
//if subarray length is odd, then only call add Sum to total Sum else just keep adding nums[i] to sum;
if((j-i+1)%2 != 0){
totalSum += sum;
}
}
}
return totalSum;
**Optimized APP where TC = O(N)**
​
​
​