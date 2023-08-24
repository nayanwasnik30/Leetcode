class Solution {
    public String makeGood(String s) {
        Stack<Character> stack= new Stack<>();
		for(int i=s.length()-1;i>=0;i--){
			 char ch = s.charAt(i);
            if (!stack.isEmpty() && Math.abs(stack.peek() - ch) == 32) {
                stack.pop();
            } else {
                stack.push(ch);
            }
		}
		StringBuilder sb = new StringBuilder();
		
		for(int i=stack.size()-1;i>=0;i--){
			sb.append(stack.pop());
		}
		return sb.toString();
    }
}