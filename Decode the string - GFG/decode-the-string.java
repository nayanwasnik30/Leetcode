//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            
            Solution ob = new Solution();
            out.println(ob.decodedString(s));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String decodedString(String s){
        // code here
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