//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        
        for(int x : a){
            if(x == 0) cnt0++;
            else if (x == 1) cnt1++;
            else cnt2++;
        }
        
        
        for(int j=0; j<cnt0; j++){
            a[j] = 0;
        }
        for(int j=cnt0; j<cnt1+cnt0; j++){
            a[j] = 1;
        }
        for(int j=cnt0+cnt1; j<cnt0+cnt1+cnt2; j++){
            a[j] = 2;
        }
    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends