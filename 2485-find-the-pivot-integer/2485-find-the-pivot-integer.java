class Solution {
    public int pivotInteger(int n) {
        if(n == 1) return 1;

        int left = 1, right = n, leftSum = 1, rightSum = n;
        while(left < right){
            if(leftSum == rightSum && left+1 == right-1){
                return left + 1;
            }
            else if(leftSum < rightSum){
                left++;
                leftSum += left;
            }
            else{
                right--;
                rightSum += right;
            }
        }
        return -1;
    }
}