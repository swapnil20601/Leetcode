class Solution {
    public int sumSubarrayMins(int[] arr) {
        int mod = 1_000_000_007;
        long ans = 0;
        int n = arr.length;

        int[] nsl = getNSL(arr);
        int[] nsr = getNSR(arr);

        for(int i = 0; i < n; i++){
            long totalsubArrays = (i - nsl[i]) *(nsr[i] - i);
            long totalSum = totalsubArrays * arr[i];
            ans = (ans + totalSum) % mod;
        }
        return (int)ans;
    }

    private int[] getNSL(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < n; i++){
            while(!s.isEmpty() && arr[i] <= arr[s.peek()]){
                s.pop();
            }

            res[i] = (s.isEmpty()) ? -1 : s.peek();
            s.push(i);
        }
        return res;
    }

    private int[] getNSR(int[] arr){
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> s = new Stack<>();

        for(int i = n-1; i >= 0; i--){
            while(!s.isEmpty() && arr[i] < arr[s.peek()]){
                s.pop();
            }

            res[i] = (s.isEmpty()) ? n : s.peek();
            s.push(i);
        }
        return res;
    }
}