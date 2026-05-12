class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res;
        HashMap<String, List<String>> map = new HashMap<>();

        if(strs.length == 0){
            //empty list
            return new ArrayList<>();
        }

        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        //Create a list & add all values from hashmap to this list & return it as answer.
        return new ArrayList<>(map.values());
    }
}