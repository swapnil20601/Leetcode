class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[index.length];
        int j = 0;
        
        for(int i = 0; i < index.length; i++){
            int idx = index[i];
            
            if(idx < i){
                j = i;
                while(j > idx){
                    target[j] = target[j-1];
                    j--;
                }
            }
            
            target[idx] = nums[i];
        }
        
        return target;
    }
}