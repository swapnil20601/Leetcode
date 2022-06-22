class Solution {
    public String reverseStr(String s, int k) {
        char[] res = s.toCharArray();
        
        for(int i = 0; i < res.length; i = 2*k+i){
            int j = Math.min(i+k-1, s.length()-1);
            reverseSubString(res,i,j);
        }
        
        return new String(res);
    }
    
    private void reverseSubString(char[] arr, int i, int j){
        while(i<j){
            char temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }
    
}