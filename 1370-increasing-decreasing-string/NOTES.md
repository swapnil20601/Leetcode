public String sortString(String s) {
StringBuilder ans = new StringBuilder();
int[] count = new int[26];
for (char c : s.toCharArray())
++count[c - 'a'];
while (ans.length() < s.length()) {
add(count, ans, true);
add(count, ans, false);
}
return ans.toString();
}
private void add(int[] cnt, StringBuilder ans, boolean asc) {
for (int i = 0; i < 26; ++i) {
int j = asc ? i : 25 - i;
if (cnt[j]-- > 0)
ans.append((char)(j + 'a'));
}
}
int[] freq = new int[26];
StringBuilder res = new StringBuilder();
for(int i = 0; i < s.length(); i++){
freq[s.charAt(i) - 'a']++;
}
while(res.length() < s.length()){
for(int i = 0; i < 26; i++){
if(freq[i]-- > 0){
res.append((char)(i+97));
}
}
for(int i = 25; i >= 0; i--){
if(freq[i]-- > 0){
res.append((char)(i+97));
}
}
}
return res.toString();