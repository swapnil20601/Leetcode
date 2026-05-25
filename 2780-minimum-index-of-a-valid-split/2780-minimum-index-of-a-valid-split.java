class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();
        
        int majorityElement = getMajorityElement(nums);
        int majorityCount = getMajorityElementCount(nums, majorityElement);
        int frequency = 0;

        for(int i = 0; i < n; i++){
            if(nums.get(i) == majorityElement){
                frequency++;
                majorityCount--;
                int n1 = i+1;
                int n2 = n-i-1;
                if(frequency > n1/2 && majorityCount > n2/2){
                    return i;
                }
            }
        }

        return -1;
    }

    private int getMajorityElement(List<Integer> list){
        int n = list.size();
        int candidate = Integer.MIN_VALUE;
        int count = 0;

        for(int i = 0; i < n; i++){
            if(count == 0){
                candidate = list.get(i);
                count = 1;
            }
            else if(list.get(i) == candidate){
                count++;
            }
            else{
                count--;
            }
        }

        return candidate;
    }

    private int getMajorityElementCount(List<Integer> list, int x){
        int count = 0;
        for(Integer ele : list){
            if(ele == x){
                count++;
            }
        }
        return count;
    }
}