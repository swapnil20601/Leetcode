class Solution {
    public boolean judgeCircle(String moves) {
        int xAxis = 0, yAxis = 0;
        
        for(char move: moves.toCharArray()){
            switch(move){
                case 'U' : yAxis++;
                    break;  
                case 'D' : yAxis--;
                    break;
                case 'R' : xAxis++;
                    break;
                case 'L' : xAxis--;
                    break;
                    
            }
        }
        
        return xAxis == 0 && yAxis == 0;
    }
}