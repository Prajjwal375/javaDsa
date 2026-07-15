class Solution {
    public String removeKdigits(String num, int k) {
     Stack<Character> stack = new Stack<>();
     for(char c: num.toCharArray()){
        while(!stack.isEmpty()&& k>0 && stack.peek() > c){
            stack.pop();
            k--;
        }
        stack.push(c);
     }

     // remove remaining
     while(k>0 && !stack.isEmpty()){
        stack.pop();
        k--;
     }

     StringBuilder sb = new StringBuilder();
     //bottom -> top
     for(char ch:stack){
        sb.append(ch);
     }
     // if there are zeros at the start of sb
     while(sb.length()>0 && sb.charAt(0) == '0'){
        sb.deleteCharAt(0);
     }

     if(sb.length() > 0) return sb.toString();
     else return "0";
    }
}