class Solution {
    public String sortSentence(String s) {
        if(s.length() <= 0) {
            return s;
        }
        
        String[] str = s.split(" ");
        String[] res = new String[str.length];

        for (String word : str) {
            char ch = word.charAt(word.length() - 1);
            int i = Character.getNumericValue(ch) - 1;
            res[i] = word.substring(0, word.length() - 1);
        }

        return String.join(" ", res);
    }
}