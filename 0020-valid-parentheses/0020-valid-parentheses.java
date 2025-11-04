class Solution {
    public boolean isValid(String s) {
        if(s.length()<=1) return false;
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('|| ch=='[' || ch=='{'){
                stack.push(ch);
            }else{
                if(stack.size()==0) return false;
                char open=stack.peek();
                if(open=='(' && ch==')'){
                    stack.pop();
                }else if(open=='[' && ch==']'){
                    stack.pop();
                }else if(open=='{' && ch=='}'){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        if(stack.size()==0) return true;
        else{
        return false;
        }
    }
}