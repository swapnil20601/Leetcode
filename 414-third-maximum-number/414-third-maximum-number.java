class Solution {
    public int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        
        if(nums.length == 1){
            return nums[0];
        }
        
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        
        for(int i: nums){
            //we dont want duplicate nums in 1st/2nd/3rdmax. So we check if i == to either of them, then we ignore i & moove forward
            if(i==firstMax || i==secondMax || i==thirdMax){
                continue;
            }
            
            if(i > firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = i;
            }
            else if(i > secondMax){
                thirdMax = secondMax;
                secondMax = i;
            }
            else if(i > thirdMax){
                thirdMax = i;
            }
        }
        
        //cosniuder nums =[1,2,2,2,2] 0r [2,1,2,1]. Here we dont get 3rdMax. 3rdMax = -inf. 
        //So in that we have to return largest of all as per question(see 2nd example in Question). So we take care of that here
        if(thirdMax == Long.MIN_VALUE) {
            return (int)firstMax;
        }
        else {
            return (int)thirdMax;
        }
    }
}

//Similar: https://www.geeksforgeeks.org/third-largest-element-array-distinct-elements/