/*
TC: O(n+m) + O(log min(n, m))
where
n = length of str1
m = length of str2
 */
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }

        int size = gcd(str1.length(), str2.length());
        return str1.substring(0,size); // OR you can also return str2.substring(0,size), it does not matter since both strings will have same substring "x"
    }

    private int gcd(int a, int b){
        while(b != 0){
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
}

