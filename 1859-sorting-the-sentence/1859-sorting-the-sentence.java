class Solution {
    public String sortSentence(String s) {
        if(s.length() <= 0) {
            return s;
        }
        
        String[] str = s.split(" ");
        String[] res = new String[str.length];
        StringBuilder sb = new StringBuilder(); 

        for (String word : str) {
            char ch = word.charAt(word.length() - 1);
            int i = ch - '1';
            res[i] = word.substring(0, word.length() - 1);
        }

        for (int i = 0; i < res.length-1; i++) {
            sb.append(res[i]).append(" ");
        }
        
        sb.append(res[res.length-1]);
        return sb.toString();
    }
}