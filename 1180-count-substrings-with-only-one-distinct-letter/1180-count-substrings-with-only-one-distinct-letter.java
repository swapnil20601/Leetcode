class Solution {
    public int countLetters(String s) {
        int[] res = new int[s.length()];
        int i = 0, j = 0, n = res.length, count = 0;
        int total = 0;
        
        while(i < n && j < n){
            if(s.charAt(i) == s.charAt(j)){
                count += 1;
                res[j++] = count;
            }
            else{
                count = 0;
                i = j;
            }
        }
        
        for(int val: res){
            total += val;
        }
        
        return total;
    }
}