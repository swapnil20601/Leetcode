class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        if(strs.length == 0){
            return res;
        }

        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if(map.containsKey(key)){
                map.get(key).add(s);
            }
            else{
                List<String> temp = new ArrayList<>();
                temp.add(s);
                map.put(key, temp);
            }
        }

        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            res.add(entry.getValue());
        }

        return res;
    }
}