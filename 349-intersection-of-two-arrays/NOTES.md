res[index++] = val;
}
return res;
}
------------------------------------------------------------------------------
**Approach 2: Using sorting & set
TC = O(nlogn)
SC= O(n)**
​
//Sort both arrays. Then iterate over both arrays. If 2 elemensts re same then add it to set & increment both i & j. IF ele in 1st arrays is smaller then 2nd array, then move i fwd with hope that you will find the ele in 2nd array ahead in arra1. Else move j fwd
​
​
public int[] intersection(int[] nums1, int[] nums2) {
Arrays.sort(nums1);
Arrays.sort(nums2);
Set<Integer> set = new HashSet<>();
int i = 0, j = 0;
while(i < nums1.length && j < nums2.length){
if(nums1[i] < nums2[j]){
i++;
}
else if(nums1[i] > nums2[j]){
j++;
}
else {
set.add(nums1[i]);
i++;
j++;
}
}
int res[] = new int[set.size()];
int index = 0;
for(int val : set){
res[index++] = val;
}
return res;