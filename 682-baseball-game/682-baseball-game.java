class Solution {
    public int calPoints(String[] ops) {
        int sum = 0;
        LinkedList<Integer> list = new LinkedList<>();

        for (String obj : ops) {
            if(obj.equals("C")){
                sum -= list.removeLast();
            }
            else if(obj.equals("D")){
                int lastEle = list.getLast();
                int doubleVal = lastEle + lastEle;// we dont do 2 * lastEle becoz consider TC where lastEle = -2 & -2 * -2 = 4. But we want -4 after doubling -2
                list.addLast(doubleVal);;
                sum += doubleVal;
            }
            else if(obj.equals("+")){
                int first = list.removeLast();
                int second = list.removeLast();
                int res = first+second;
                list.addLast(second);
                list.addLast(first);
                list.addLast(res);
                sum += res;
            }
            else {
                int ele = Integer.valueOf(obj);
                list.addLast(ele);
                sum += ele;
            }
        }
        return sum;
    }
}