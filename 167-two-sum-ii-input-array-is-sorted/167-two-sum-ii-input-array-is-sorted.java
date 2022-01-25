class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length-1;
        
        while(numbers[start] + numbers[end] != target){
            if(numbers[start] + numbers[end] < target){
                start++;
            }
            else {
                end--;
            }
        }
        
    /*Question says there here is exactly one solution. So we return directly the ans as sson as we find 1st pair that sums to target. 
    Also in question it is given numbers[] is an 1-indexed based array so we are adding 1 to end & start wile returning ans;*/
        return new int[]{start + 1, end + 1};
    }
}



