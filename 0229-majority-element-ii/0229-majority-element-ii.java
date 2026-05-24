class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        int candidate1 = Integer.MIN_VALUE;
        int candidate2 = Integer.MIN_VALUE;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == candidate1){
                count1++;
            }
            else if(nums[i] == candidate2){
                count2++;
            }
            else if(count1 == 0){
                candidate1 = nums[i];
                count1 = 1;
            }
            else if(count2 == 0){
                candidate2 = nums[i];
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }

        int freq1 = verifyCandidateCount(nums,candidate1);
        int freq2 = verifyCandidateCount(nums,candidate2);

        if(freq1 > n/3){
            res.add(candidate1);
        }
        if(freq2 > n/3){
            res.add(candidate2);
        }

        return res;
    }

    private int verifyCandidateCount(int[] arr, int x){
        int count = 0;
        for(int ele : arr){
            if(ele == x){
                count++;
            }
        }
        return count;
    }
}