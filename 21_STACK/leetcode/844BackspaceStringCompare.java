// using two stack my own solve

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        for(char a:s.toCharArray()){
            if(a == '#'){
                if (!s1.isEmpty()){
                s1.pop();
                }
            }else s1.push(a);
        }
        for(char b:t.toCharArray()){
            if(b == '#'){
                if (!s2.isEmpty()){
                s2.pop();
                }
            }else s2.push(b);
        }
        if(s1.equals(s2)){
            return true;
        }else return false;
    }
}

//   function calling
class Solution {
    public boolean backspaceCompare(String s, String t) {
        return stack(s).equals(stack(t));
    }

    public String stack(String s){
        Stack<Character> ans = new Stack<>();
         for(char a:s.toCharArray()){
            if(a == '#'){
                if (!ans.isEmpty()){
                ans.pop();
                }
            }else ans.push(a);
        }
        return String.valueOf(ans);
        
    }
       
    
}
