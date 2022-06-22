class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num <= 1){
            return false;
        }
        
        int sum = 1;
        
        int sqrt = (int)Math.sqrt(num);
        
        //we i <=sqrt becoz consider ex num = 36, then 6*6 = 36. We have to take 6 also in account. But only once if i*i = num.
        // Otherwise also take num/i into account with i
        
        for(int i = 2; i <= sqrt; i++){
            if(num%i==0){
                sum += i;
                if(i*i != num){
                    sum = sum + (num/i);
                }
            }
        }
        
        return sum == num;
    }
}