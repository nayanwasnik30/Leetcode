//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}

// } Driver Code Ends


class Solution{
    static int minJumps(int[] arr){
        // your code here
        int n=arr.length;
         int i=0;
        int max=0,point=0,steps=1;
        int sum=arr[i]+i;
        if(arr[0]==0){
            return -1;
        }
        while(sum<n-1){
            max=0;point=0;
            for(int j=i+1;j<arr[i]+i+1;j++){
                if(arr[j]+j>max){
                    point=j;
                    max=arr[j]+j;
                }
            }
            if(max-point==0){
                return -1;
            }
            i=point;
            sum=max;
            steps++;
        }
        return steps;
    }
}