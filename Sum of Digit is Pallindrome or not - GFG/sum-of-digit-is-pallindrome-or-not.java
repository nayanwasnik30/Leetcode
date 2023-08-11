//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int N) {
        // code here
        int digit=0;
        int sum=0;
        while(N>0)
        {
            digit=N%10;
            sum+=digit;
            N=N/10;
        }
        String str=String.valueOf(sum);
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
        
        int reversedNumber=Integer.parseInt(stringBuilder.toString());
        
        if(reversedNumber==sum)
        {
            return 1;
        }
        return 0;
        
    }
}