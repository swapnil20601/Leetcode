**Approach 1 : Using HashSet:
TC = O(N)
SC= O(N)**
public String destCity(List < List < String >> paths) {
Set < String > city = new HashSet < > ();
​
for (List < String > path: paths) {
city.add(path.get(0));
}
​
for (List < String > path: paths) {
if (!city.contains(path.get(1))) {
return path.get(1);
}
}
​
return "";
}
​
**Approach 2 : Using HashTable:
TC = O(N)
SC= O(N)**
​