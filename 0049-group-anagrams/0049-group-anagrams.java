class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        if(strs.length == 0){
            //empty list
            return new ArrayList<>();
        }

        for(String s : strs){
            String key = getFrequencyString(s);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        //Create a list & add all values from hashmap to this list & return it as answer.
        return new ArrayList<>(map.values());
    }

    private String getFrequencyString(String word){
        int[] arr = new int[26];
        StringBuilder frequencyString = new StringBuilder("");

        for(char ch : word.toCharArray()){
            arr[ch - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            while(arr[i] > 0){
                frequencyString.append(i+'a');
                arr[i]--;
            }
        }

        return frequencyString.toString();
    }
}