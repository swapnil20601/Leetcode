class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        
        for(int i = 0; i < n; i++){
            if(res.contains(nums[i])){
                continue;
            }
            int count = 0;
            for(int j = 0; j < n; j++){
                if(nums[j] == nums[i]){
                    count++;
                }
            }
            if(count > n/3){
                res.add(nums[i]);
            }
            //If the list contains 2 elements, we are done. Becoz we know at max there can be only 2 candidates whose frequncy is > n/3
            if(res.size() == 2){
                break;
            }
        }

        return res;
    }
}