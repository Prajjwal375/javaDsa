// 150. Evaluate Reverse Polish Notation

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String c: tokens){
            if(c.equals("+")){
                int first = s.pop();
                int second = s.pop();
                s.push(first + second);
            }else if(c.equals("-")){
                int first = s.pop();
                int second = s.pop();
                s.push(second-first);
            }else if(c.equals("*")){
                int first = s.pop();
                int second = s.pop();
                s.push(second*first);
            }else if(c.equals("/")){
                int first = s.pop();
                int second = s.pop();
                s.push(second/first);
            } else s.push(Integer.parseInt(c));
        }

    return s.peek();
    }
}