class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i+=2*k){
            int j = Math.min(i+k-1, arr.length-1);
            rev(arr, i, j);
        }
        return new String(arr);
    }
    
    private static void rev(char[] arr, int i, int j) {
        while(i < j){
            char temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }
}