public class Solution {
​
//Best Appraoahc: Using XOR. Takes O(N)
public static int findUnique(int[] arr) {
//Your code goes here
if(arr.length == 1){
return arr[0];
}
​
int ans = 0;
for (int num : arr) {
ans = ans ^ num;
}
return ans;
}
}
​
//Appraoch 2:Using sorting-->
//Good approach but not better than XOR becaoz it uses sorting & hence takes O(n log n) + O(n) time
​
public static int findUnique(int[] arr) {
//Your code goes here
if(arr.length == 1){
return arr[0];
}
Arrays.sort(arr);
int i = 0, j = 1, ans = -1;
​
while(i < arr.length && j < arr.length){
if(arr[i] != arr[j]){
return arr[i];
} else {
i = j+1;
j = i+1;
}
}
​
if(i < arr.length){
ans = arr[i];
}
return ans;
}