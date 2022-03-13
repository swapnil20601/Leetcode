class Solution {
    public int maxDistance(int[] colors) {
        int res = 0;
        
        //from left to right
        for(int i = 0; i < colors.length; i++){
            if(colors[colors.length-1] != colors[i]){
                res = Math.max(res, colors.length-1-i);
                break;
            }
        }
        
        //movr from roght to left
        for(int i = colors.length-1; i>=0 ;i--){
            if(colors[0] != colors[i]){
                res = Math.max(res, i-0);
                break;
            }
        }
        
        return res;
    }
}