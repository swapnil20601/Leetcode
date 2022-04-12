class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        /*
        we create array of 128 size bcoz A-z & a-z characters lies bewteen 65- 122 range. 
        so we need to use array with size at least = 123
        */
        int[] frequency = new int[128]; 
        
        for(char s : stones.toCharArray()){
            frequency[s]++;
        }
        
        for(char j :jewels.toCharArray()){
            count = count + frequency[j];
        }
        
        return count;
    }
}