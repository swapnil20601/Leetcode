**Brute force
TC  = O(N)
SC = O(1)**
​
public int peakIndexInMountainArray(int[] arr) {
if(arr.length < 3){
return -1;
}
//If 1st element itself is peak
if(arr[0] > arr[1]){
return 0;
}
//if last element is peak
if(arr[arr.length-1] > arr[arr.length-2]){
return arr.length-1;
}
//if 1st or last element is not peak
for(int i= 1; i < arr.length-1; i++){
if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
return i;
}
}
return -1;
}
--------------------------------------------------------------------
Binary Search:
TC = O(log n)
SC = O(1)