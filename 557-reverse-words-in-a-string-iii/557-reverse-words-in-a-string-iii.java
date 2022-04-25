class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        
        for(int j = 0; j < arr.length; j++){
            if(arr[j] == ' '){
                reverseChars(arr, i, j-1);
                i = j + 1;
            }
        }
        reverseChars(arr, i, arr.length-1);
        
        return String.valueOf(arr);
    }
    
    public void reverseChars(char[] arr, int i, int j){
        while(i < j){
            char temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }
    
}