//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String N = sc.next ();

            if (new Sol().balancedNumber (N))
    		    System.out.println (1);
    		else
    		    System.out.println (0);
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    Boolean balancedNumber(String N)
    {
        // your code here   
        if(N.length()<=1){
            return true;
        }
        int count =0;
        for(int i=0;i<N.length()/2;i++){
            char ch=N.charAt(i);
            count +=ch-0;
        }
        int count2=0;
        for(int i=(N.length()/2)+1;i<N.length();i++){
            char ch=N.charAt(i);
            count2 +=ch-0;
        }
        if(count == count2){
            return true;
        }else{
            return false;
        }
    }
}