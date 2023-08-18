//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}




// } Driver Code Ends


class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        // your code here
        long [] nsr = new long [(int)n];
        long [] nsl = new long [(int)n];
        
        Stack<Integer> stack1 = new Stack<>();
        
        for(int i=0;i<n;i++){
            long ele =hist[i];
            while(stack1.size()>0 && ele<hist[stack1.peek()] ){
                int idx = stack1.pop();
                nsr[idx]=i;
            }
            stack1.push(i);
        }
        while(stack1.size()>0){
            int idx=stack1.pop();
            nsr[idx]=n;
        }
        
        Stack<Integer> stack2 = new Stack<>();
         
        for(int i=(int)n-1;i>=0;i--){
            long ele =hist[i];
            while(stack2.size()>0 && ele<hist[stack2.peek()] ){
                int idx = stack2.pop();
                nsl[idx]=i;
            }
            stack2.push(i);
        }
        while(stack2.size()>0){
            int idx=stack2.pop();
            nsl[idx]=-1;
        }
        
        long arr [] = new long [(int)n];
        long max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
          arr[i]=(nsr[i]-nsl[i])-1;
          max=Math.max(hist[i]*arr[i],max);
        // System.out.print(nsl[i]+" ");
        }
        
        return max;
    }
        
}



