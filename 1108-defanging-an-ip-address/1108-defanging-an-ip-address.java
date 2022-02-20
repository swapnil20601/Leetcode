class Solution {
    public String defangIPaddr(String address) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < address.length(); i++){
            char curr = address.charAt(i);
            if(curr == '.'){
                sb.append("[.]");
            }
            else {
                sb.append(curr);
            }
        }
        return sb.toString();
    }
}