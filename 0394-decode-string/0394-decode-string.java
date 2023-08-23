class Solution {
    public String decodeString(String s) {
        Stack <Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch !=']'){
				stack.push(ch);
			}else{
				StringBuilder sb = new StringBuilder();
				String sub = new String();
				while(stack.size()>0 && stack.peek()!='['){
					sb.append(stack.pop());
				}
				stack.pop();
				while(stack.size()>0 && Character.isDigit(stack.peek())){
					sub=stack.pop()+sub;
				}	
				int count =Integer.parseInt(sub);
				while(count>0){
					for(int j=sb.length()-1;j>=0;j--){
						stack.push(sb.charAt(j));
					}
					count--;
				}
			}
		}
		char [] ans = new char[stack.size()];
		for(int i=stack.size()-1;i>=0;i--){
			ans[i]=stack.pop();
		}
		return new String(ans); 
    }
}