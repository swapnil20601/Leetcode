class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int[] arr = new int[flowerbed.length + 2]; //create new array with 2 more additional spaces
        int count = 0;
        
        //now fill in new array with same values of flowerbed array by leaving 1st & last position empty
        for(int i = 0; i < flowerbed.length; i++){
            arr[i+1] = flowerbed[i];
        }
        
        //check in arr[] if prev & next places are empty?
        //if they are empty then increment count & plant flower in that position
        //else move fwd
        for(int i = 1; i < arr.length-1; i++){
            if(arr[i] == 0 && arr[i-1] == 0 && arr[i+1] == 0){
                arr[i] = 1;
                count++;
            }
        }
        
        //If the count is >= n means there are more/equal empty places available to plant flowers than no of flowers you have
        //which is acceptable. If count < n then it means you have less empty places to plant flowers & you have
        //more no. of flowers to plant which is not acceptable
        return count >= n;
    }
}