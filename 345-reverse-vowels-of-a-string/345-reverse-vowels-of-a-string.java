class Solution {
    public String reverseVowels(String s) {
        char[] res = s.toCharArray();
        
        Set<Character> vowels = Set.of('a','e','i','o','u','A','E','I','O','U');
        /* Or instead of Set.Of() you can use Arrays.asList() as follows:
        
        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'))
        */
        
        int i = 0, j = s.length()-1;
        
        while(i < j){
            
            if(!vowels.contains(res[i])){
                i++;
            }
            else if(!vowels.contains(res[j])){
                j--;
            }
            else{
                char temp = res[i];
                res[i++] = res[j];
                res[j--] = temp;
            }
        }
        
        return String.valueOf(res);
       
    }
}