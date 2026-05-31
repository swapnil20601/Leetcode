class Solution {
    public int maxProduct(int[] nums) {
        int prefixProd = 1;
        int suffixProd = 1;
        int ans = nums[0];
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(prefixProd == 0){
                prefixProd = 1;
            }

            if(suffixProd == 0){
                suffixProd = 1;
            }

            prefixProd *= nums[i];
            suffixProd *= nums[n-i-1];
            ans = Math.max(ans, Math.max(prefixProd, suffixProd));
        }
        
        return ans;
    }
}