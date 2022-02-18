class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int maxCount = 0;
        
        for(int candy : candies){
            maxCount = Math.max(maxCount, candy);
        }
        
        for(int candy : candies){
            ans.add(candy + extraCandies >= maxCount);
        }
        
        return ans;
    }
}

