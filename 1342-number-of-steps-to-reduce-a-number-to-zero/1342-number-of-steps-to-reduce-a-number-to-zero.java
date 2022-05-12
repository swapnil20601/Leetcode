class Solution {
    public int numberOfSteps(int num) {
        if(num == 0) return 0;
        
        int steps = 0;
        
        while(num > 0){
            if((num & 1) == 0){
                steps++;
            }
            else{
                steps = steps + 2; //bcoz we are subtracting 1 & also since n
            }
            num = num >> 1;
        }
        
        return steps-1;
    }
}

/*
Explaination:
Usually we have to divide the number by 2 if it's even and subtract 1 if it's odd.
Look if we see the binary form of an even number, we'll get 0 in the last and for odd numbers there will be 1 in the end. 2 -> 10 and 3 -> 11

Now "&" operator returns 1 if both operands are 1 otherwise 0.
So, if we compute 8 & 1 ->> (1000 & 1) ->> (1000 & 0001) ->> 0000
and 3 & 1 ->> 11 & 1 ->> 01
this is what the statement does: num & 1 ->> so if returns 0(for even) we'll have to divide by 2, means number of operations are 1 and if returns 1(for odd) we'll have to first subtract 1 then divide, so no. of operations became 2. Hence we do the above operation.

After this num >>= 1 divides the number by 2, as irrespective of it is even or odd we'll get the same answer, so simply divide and as we've already calculated the answer already.

And for the left most 1 for which we'll get 0 by just subtracting 1 but our logic considers it 2 so at last do res - 1.

For someone looking for why right shift?
Right shift by one is equivalent to divide the number by 2 regardless of it being even or odd.
For example,
25 = 11001, 24 = 11000
25/2 = 12 and 24/2 = 12 are both 1100

*/