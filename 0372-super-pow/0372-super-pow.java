class Solution {
    public int superPow(int a, int[] b) {
        int pow = 0;
        inr mod = 1140;
        for(int val : b){
            pow = (((pow * 10) % mod) + val) % mod;
        }
        
        if(pow == 0){
            pow = 1140;
        }
        return binpow(a,pow,1337);
    }

    private int binpow(int a, int p, int mod){
        a = a % mod;
        int res = 1;
        while(p > 0){
            if((p&1)==1){
                res = (res*a)%mod;
            }
            a = (a*a)%mod;
            p = p >> 1;
        }
        return res;
    }
}