class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> list = new ArrayList<>();
        int prev = lower - 1;
        
        for(int i = 0 ; i <= nums.length; i++){
            int curr = (i < nums.length)? nums[i] : upper + 1;
            
            if(prev+1 <= curr-1){
                list.add(helper(prev+1,curr-1));
            }
            prev = curr;
        }
        
        return list;
    }
    
    private String helper(int prev, int curr){
        return (prev == curr)? Integer.toString(prev) : prev +"->"+ curr;
        //or can use String.valueOf(prev)
        //return s;
    }
}