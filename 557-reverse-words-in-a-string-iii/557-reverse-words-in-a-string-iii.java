class Solution {
    public String reverseWords(String s) {
        char[] words = s.toCharArray();
        int j = 0;
        
        for(int i = 0; i < words.length && j <= words.length; j++){
            if(j == words.length || words[j] == ' '){
                rev(words,i,j-1);
                i = j+1;
            }
        }
        
        return String.valueOf(words);
    }
    
    private void rev(char[] arr, int i, int j){
            while(i<j){
                char temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;
            }
        }
    
}