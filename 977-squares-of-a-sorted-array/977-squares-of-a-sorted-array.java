class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int i = 0; //most negative number'
        int j = nums.length - 1; //most positive number
        int maxVal = nums.length - 1;//for foling the res[] array
        
        while(i <= j){
            int leftVal = nums[i] * nums[i];
            int rightVal = nums[j] * nums[j];
            
            if(leftVal > rightVal){
                res[maxVal--] = leftVal;
                i++;
            }
            else {
                res[maxVal--] = rightVal;
                j--;
            }
        }
        return res;
    }
}