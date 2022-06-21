class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) {
			return 0;
		}
        
        //if len(needle) is greater than haystack, then for sure needle could not be present in haystack so return -1 directly
		if(haystack.length() < needle.length()) {
			return -1;
		}
		
		for(int i= 0; i < haystack.length(); i++) {
			int h = i;
			int j = 0;
			while(h < haystack.length() && j < needle.length() && haystack.charAt(h) == needle.charAt(j)) {
				j++;
				h++;
			}
            
			if(j == needle.length()) {
				return i;
			}
		}
		return -1;
    }
}