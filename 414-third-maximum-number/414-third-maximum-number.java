class Solution {
    public int thirdMax(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        for(int val : nums){
            set.add(val);
        }
        
        int firstMax = Collections.max(set);
        
        //If 3rd max does not exists, then just return maximum as per question
        if(set.size() < 3){
            return firstMax;
        }
        
        //Otherwise continue finding 2nd & 3rd max
        set.remove(firstMax);
        
        //find 2nd max and delete it
        int secondMax = Collections.max(set);
        set.remove(secondMax);
        
        //find 3rd max & now return it
        return Collections.max(set);
    }
}

//Similar: https://www.geeksforgeeks.org/third-largest-element-array-distinct-elements/