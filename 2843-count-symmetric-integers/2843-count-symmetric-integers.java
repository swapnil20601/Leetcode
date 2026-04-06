class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans = 0;
        for(int i = low; i <= high; i++){
            int len = getLength(i);
            if(len%2 == 0){
                if(isSymmetric(i,len/2)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    private boolean isSymmetric(int x, int n){
        int leftSum = 0, rightSum = 0, count = n;
        while(count > 0){
            rightSum = rightSum + (x % 10);
            x = x / 10;
            count--;
        }

        while(n > 0){
            leftSum = leftSum + (x % 10);
            x = x / 10;
            n--;
        }

        return leftSum == rightSum;
    }

    private int getLength(int n){
        int len = 0;
        while(n > 0){
            len++;
            n /= 10;
        }
        return len;
    }
}