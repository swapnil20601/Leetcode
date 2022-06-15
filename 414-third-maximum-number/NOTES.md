if (i > firstMax) {
thirdMax = secondMax;
secondMax = firstMax;
firstMax = i;
} else if (i > secondMax) {
thirdMax = secondMax;
secondMax = i;
} else if (i > thirdMax) {
thirdMax = i;
}
}
​
//cosniuder nums =[1,2,2,2,2] 0r [2,1,2,1]. Here we dont get 3rdMax. 3rdMax = -inf.
//So in that we have to return largest of all as per question(see 2nd example in Question). So we take care of that here
if (thirdMax == Long.MIN_VALUE) {
return (int) firstMax;
} else {
return (int) thirdMax;
}
}
​
**Appraich 2: See Approach 1 os Solution section. But above approach is better
**
​
​