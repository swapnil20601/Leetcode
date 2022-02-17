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
​
​
//Without using any extra index variablesur
int[] res = new int[2*n];
for(int i = 0 ; i < n ; i++){
res[2*i] = nums[i];
res[2*i+1] = nums[i+n];
}
return res;