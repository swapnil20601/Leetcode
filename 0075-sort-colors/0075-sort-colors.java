class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        
        //Initialize temp[] with all 1's
        Arrays.fill(temp, 1);
        int zeros = 0, twos = n-1;

        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                temp[zeros] = 0;
                zeros++;
            }
            else if(nums[i] == 2){
                temp[twos] = 2;
                twos--;
            }
        }

        //copy back all items from temp[] to original nums[]
        for(int i = 0; i < n; i++){
            nums[i] = temp[i];
        }
    }
}