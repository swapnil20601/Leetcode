class Solution {
    public int balancedStringSplit(String s) {
        int balancedCounter = 0, leftCounter = 0, rightCounter = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'L'){
                leftCounter++;
            }
            else {
                rightCounter++;
            }
            
            if(rightCounter == leftCounter){
                balancedCounter++;
            }
        }
        
        return balancedCounter;
    }
}