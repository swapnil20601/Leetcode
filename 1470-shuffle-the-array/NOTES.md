// Using extra pointer j:
​
public int[] shuffle(int[] nums, int n) {
int[] res = new int[2*n];
int j = 0;
for(int i = 0 ; i < n ; i++){
res[j++] = nums[i];
res[j++] = nums[i+n];
}
return res;
}