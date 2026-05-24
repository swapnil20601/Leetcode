class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int x : arr){
            map.put(x, map.getOrDefault(x,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();

            if(val > n/4){
                return key;
            }
        }

        return -1;
    }
}