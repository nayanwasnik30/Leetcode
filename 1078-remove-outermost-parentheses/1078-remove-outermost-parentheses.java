class Solution {
    public String removeOuterParentheses(String s) {
        boolean arr [] = new boolean [s.length()];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stack.push(i);
            }else{
                int open=stack.pop();
                if(stack.size()==0){
                    arr[open]=true;
                    arr[i]=true;
                }
            }
        }
        StringBuilder str = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==false)
            str.append(s.charAt(i));
        }

        return str.toString();
    }
}