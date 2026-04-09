class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0, j = 0, n = fruits.length;
        int ans = Integer.MIN_VALUE;
        while(j < n){
            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);

            /* This means window is valid as per given condition. So we capture
            window size*/
            if(map.size() <= 2){ 
                ans = Math.max(ans, j-i+1);
            /*This means it is invalid condition. So we shrink window size by
            moving i */
            }
            else{
                map.put(fruits[i],map.get(fruits[i])-1);
                if(map.get(fruits[i]) == 0){
                    map.remove(fruits[i]);
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}
