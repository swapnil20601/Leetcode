​
​
public String reverseWords(String s) {
char[] arr = s.toCharArray();
​
int left = 0;
for (int right = 0; right < arr.length; right++) {
if(arr[right] == ' '){
rev(arr, left, right-1);
left = right+1;
}
}
rev(arr, left, arr.length-1);
return String.valueOf(arr);
}
private static void rev(char[] arr, int i, int j) {
while(i < j){
char temp = arr[i];
arr[i++] = arr[j];
arr[j--] = temp;
}
}