class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int j = 0;
        
        for(int i = 0; i < arr.length; i = i+2*k){
            j = Math.min(arr.length-1, i+k-1);
            
            reverseChars(arr, i, j);
            
        }
        
        return new String(arr);
    }
    
    public void reverseChars(char[] arr, int i, int j){
        while(i < j){
            char temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }
    
}