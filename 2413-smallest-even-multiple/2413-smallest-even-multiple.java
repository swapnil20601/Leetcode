class Solution {
    public int smallestEvenMultiple(int n) {
        int x = gcd(2,n);
        return (2 * n)/x;
    }

    private int gcd(int a, int b){
        while(b != 0){
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
}