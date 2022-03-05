class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            if(i+2 < s.length() && s.charAt(i+2) == '#'){
                String sub = s.substring(i, i+2);
                int k = Integer.parseInt(sub);
                sb.append((char)(k + 97 - 1));
                i = i+2;
            }
            else{
                int y = Integer.parseInt(String.valueOf(s.charAt(i)));
                sb.append((char)(y + 'a' - 1));//or y + 97 -1  
            }       
        }
        
        return String.valueOf(sb);
    }
}

//else sb.append( (char) ( (Integer.parseInt(String.valueOf(s.charAt(i))) - 1) + 'a') ); 