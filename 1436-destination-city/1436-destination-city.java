class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> city = new HashMap<>();
        
        for(List<String> path: paths){
            city.put(path.get(0), path.get(1));
        }
        
        for(String destination: city.values()){
            if(!city.containsKey(destination)){
                return destination;
            }
        }
        return "";
    }
}


