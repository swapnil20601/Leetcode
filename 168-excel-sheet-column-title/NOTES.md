Only 1 appriach. A bit hard to understand the math. see video to understand logic
https://www.youtube.com/watch?v=UcTKk2y_3s4
​
TC = O(log26 n ) coz u r diving the number by 26 everytime
SC = O(1)
​
​
public String convertToTitle(int columnNumber) {
StringBuilder res = new StringBuilder();
while(columnNumber > 0){
char c = (char)('A' + (columnNumber - 1) % 26);
res.append(c);
columnNumber = (columnNumber - 1)/26;
}
return re