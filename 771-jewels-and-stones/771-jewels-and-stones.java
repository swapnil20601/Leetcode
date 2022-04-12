class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       char[] jewelsArray = jewels.toCharArray();
        char[] stonesArray = stones.toCharArray();
       int count = 0;
        
        for(char j : jewelsArray){
            for(char s : stonesArray){
                if(j==s){
                    count++;
                }
            }
        }
        return count;
    }
}