class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(char s:stones.toCharArray()){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        
        for(char j:jewels.toCharArray()){
            count += map.getOrDefault(j,0);
        }
        return count;
    }
}