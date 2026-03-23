class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int i = 0, j = 0, n1 = v1.length, n2 = v2.length;

        while(i < n1 || j < n2){
            int a = 0, b = 0;
            if(i < n1){
                a = Integer.parseInt(v1[i]);
            }
            if(j < n2){
                b = Integer.parseInt(v2[j]);
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