class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens){
            switch(token){
                case "+" , "-", "/", "*" ->{
                    if(!stack.isEmpty()){
                        int b = stack.pop();
                        int a = stack.pop();
                        int result = evaluate(a,b,token);
                        stack.push(result);
                    }
                }
                default -> stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private int evaluate(int a, int b, String op){
        return switch(op){
            case "+" -> a+b;
            case "-" -> a-b;
            case "/" -> a/b;
            case "*" -> a*b;
            default -> 0;
        };
    }
}