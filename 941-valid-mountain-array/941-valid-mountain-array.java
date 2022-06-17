class Solution {
    public boolean validMountainArray(int[] arr) {
        // For understanding how 2 ptrs work see this post: https://leetcode.com/problems/valid-mountain-array/discuss/1717377/JavaC%2B%2BPython-EASY-to-go-through-solution-and-EXPLANATION
        //ONLY IF  YOU DONY UNDERSTAND 
        //why there is extra condition in both while loop like l+1 & r-1
        
        if(arr.length < 3) return false;
        
        int l = 0;
        int r = arr.length - 1;
        
        while(l+1 < arr.length-1 && arr[l] < arr[l+1]){
            l++;
        }
        
        while(r-1 > 0 && arr[r] < arr[r-1]){
            r--;
        }
        
        return l==r;
    }
}