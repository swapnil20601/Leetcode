class Solution {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        
        for(int i = 0; i < ch.length; i = i + 2*k){
            int j = Math.min(ch.length - 1, i+k-1);
            reverse(ch, i , j);
        }
        
        return String.valueOf(ch);
    }
    
    private void reverse(char[] arr, int start, int end){
        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
}