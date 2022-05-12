class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        if(num == 0) return 0;
        while(num > 0){
            if((num & 1) == 0){
                steps++;
            }
            else{
                steps = steps + 2; //bcoz we are subtracting 1 & also since n
            }
            num = num >> 1;
        }
        
        return steps-1;
    }
}