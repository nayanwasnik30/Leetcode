//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            int N = Integer.parseInt(s);
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.FactDigit(N);
            for (Integer val: ans) 
                System.out.print(val);
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    ArrayList<Integer> FactDigit(int n)
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
		int arr [] = new int [10];
		arr[0]=1;
		for(int i=1;i<10;i++){
			arr[i]=arr[i-1]*i;
		}
		Stack<Integer> stack = new Stack<>();

		for(int i=9;i>0;i--){
			
			while(n>=arr[i]){
				n =n-arr[i];
				stack.push(i);
			}
		}
		if(n>0){
		    stack.push(n);
		}

		while(stack.size()>0){
			list.add(stack.pop());
		}
		return list;
    }
}