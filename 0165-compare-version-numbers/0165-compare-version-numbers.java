class Solution {
    public int compareVersion(String version1, String version2) {
        int i = 0, j = 0, n1 = version1.length(), n2 = version2.length();

        while(i < n1 || j < n2){
            int a = 0, b = 0;
            while(i < n1 && version1.charAt(i) != '.'){
                a = a * 10 + (version1.charAt(i) - '0');
                i++;
            }
            while(j < n2 && version2.charAt(j) != '.'){
                b = b * 10 + (version2.charAt(j) - '0');
                j++;
            }

            if(a < b){
                return -1;
            }
            else if(a > b){
                return 1;
            }

            i++;
            j++;
        }
        return 0;
    }
}