**Brute Force APP where TC = O(N^3)**
​
public int sumOddLengthSubarrays(int[] arr) {
int totalSum = 0;
int n = arr.length;
for(int i = 0; i < n; i++){
for(int j = i; j < n; j++){
//if subarray length is odd, then only call getSubArraySum() to find sum of all elements in that particular array
if((j-i+1)%2 != 0){
totalSum += getSubArraySum(arr, i, j);
}
}
}
return totalSum;
}
private int getSubArraySum(int[] arr, int s, int e){
int sum = 0;
for(int i = s; i <= e; i++){
sum += arr[i];
}
return sum;
}
-----------------------------------------------------------------------------
**Brute Force APP where TC = O(N^2). Idea is to use prefix sum instead of  calling getSubArraySum() that calculayes sum of all elements in that specific subarray again**