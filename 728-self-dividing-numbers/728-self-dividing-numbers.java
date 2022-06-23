class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        
        for(int i = left; i <= right; i++){
            if(isSelfDividing(i)){
                res.add(i);
            }
        }
        
        return res;
    }
    
    private boolean isSelfDividing(int n){
        int temp = n;
        
        while(temp > 1){
            int x = temp%10;
            if(x == 0 || n%x != 0){
                return false;
            }
            temp = temp / 10;
        }
        
        return true;
    }
}