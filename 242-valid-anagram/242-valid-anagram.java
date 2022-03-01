class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        
        Arrays.sort(s1);
        Arrays.sort(t1);

        String sortedS1 = String.valueOf(s1);
        String sortedT1 = new String(t1);

        return sortedS1.equals(sortedT1);
    }
}