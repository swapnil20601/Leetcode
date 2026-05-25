class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;        
        int L = 0, R = n-1;
        int pivotIndex = -1;

        while(L <= R){
            pivotIndex = partition(nums,L,R);

            if(pivotIndex == k-1){
                return nums[pivotIndex];
            }
            else if(pivotIndex > k-1){
                R = pivotIndex-1;
            }
            else{
                L = pivotIndex+1;
            }
        }

        return -1;
    }

    private int partition(int[] nums, int L, int R){
        int pivot = nums[L];
        int i = L+1, j = R;

        while(i <= j){
            if(nums[i] < pivot && nums[j] > pivot){
                swap(nums,i,j);
            }
            if(nums[i] >= pivot){
                i++;
            }
            if(nums[j] <= pivot){
                j--;
            }
        }

        swap(nums,L,j);
        return j;
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}