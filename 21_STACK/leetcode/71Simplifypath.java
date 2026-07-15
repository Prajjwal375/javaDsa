class Solution {
    public String simplifyPath(String path) {
        String str[] = path.split("/");
        Stack<String> stack = new Stack<>();

        for(String comp : str ){
            // Ignore cases
            if(comp.equals("") || comp.equals(".")){
                continue;
            }

            if(comp.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(comp);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.insert(0,"/"+ stack.pop());
        }

        // another method
        // for (String dir : stack) {
        // sb.append("/").append(dir);
        // }
        
        return sb.length() == 0? "/": sb.toString();
    }
}