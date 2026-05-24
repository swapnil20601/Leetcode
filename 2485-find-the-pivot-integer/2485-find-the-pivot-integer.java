class Solution {
    public int pivotInteger(int n) {
        int left = 1, right = n;
        int leftSum = 1, rightSum = n;

        while(left <= right){
            if(leftSum == rightSum && left == right){
                return left;
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