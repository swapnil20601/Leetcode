class Solution {
    public int calPoints(String[] ops) {
         int sum = 0;
        Stack<Integer> stk = new Stack<>();

        for (String obj : ops) {
            if(obj.equals("C")){
                sum -= stk.pop();
            }
            else if(obj.equals("D")){
                int lastEle = stk.peek();
                int doubleVal = lastEle + lastEle;// we dont do 2 * lastEle becoz consider TC where lastEle = -2 & -2 * -2 = 4. But we want -4 after doubling -2
                stk.push(doubleVal);
                sum += doubleVal;
            }
            else if(obj.equals("+")){
                int first = stk.pop();
                int second = stk.pop();
                int res = first+second;
                stk.push(second);
                stk.push(first);
                stk.push(res);
                sum += res;
            }
            else {
                int ele = Integer.valueOf(obj);
                stk.push(ele);
                sum += ele;
            }
        }
        
        return sum;
    }
}