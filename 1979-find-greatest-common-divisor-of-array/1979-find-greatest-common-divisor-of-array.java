class Solution {
    public int findGCD(int[] nums) {
        int a = 2000;
        int b = 0;

        for(int val : nums){
            a = Math.min(a,val);
            b = Math.max(b, val);
        }

        while(b != 0){
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
}