class Solution {
    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        for(int i = 0 ; i< nums.length; i+=2){
            len += nums[i];
        }
        
        int[] res = new int[len];
        
        int firstIndex = 0;
        for(int i = 0; i < nums.length; i+=2){
            Arrays.fill(res, firstIndex, firstIndex+nums[i], nums[i+1]);
            firstIndex += nums[i];
        }
        return res;
    }
}