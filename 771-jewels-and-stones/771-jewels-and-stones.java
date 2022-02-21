class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[] freq = new int[128];
        int count = 0;
        
        for(char stone: stones.toCharArray()){
            freq[stone]++;
        }
        
        for(char jewel: jewels.toCharArray()){
            count += freq[jewel];
        }
        return count;
    }
}