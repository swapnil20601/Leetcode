class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int maxi = candies[0];
        for(int val : candies){
            maxi = Math.max(maxi,val);
        }

        for(int kid : candies){
            if(kid + extraCandies >= maxi){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
    }
}