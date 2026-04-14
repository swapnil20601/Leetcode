class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        Set<String> operators = Set.of("+", "-", "/", "*");
        for(String token : tokens){
            if(!operators.contains(token)){
                stack.push(Integer.parseInt(token));
            }
            else{
                if(!stack.isEmpty()){
                    int b = stack.pop();
                    int a = stack.pop();
                    int result = evaluate(a,b,token);
                    stack.push(result);
                }
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