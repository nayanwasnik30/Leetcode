class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        boolean [] bool= new boolean [s.length()];

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stack.push(i);
                bool[i]=true;
            }else if(ch==')'){
                if(stack.size()>0){
                    int close=stack.pop();
                    bool[close]=false;
                }else{
                    bool[i]=true;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(bool[i]==false){
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}