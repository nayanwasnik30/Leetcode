//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class GFG
{
    ArrayList<Long> find(long arr[], int n, int target)
    {
        // code here // Code here
        long si =0;
        long ei=n-1;
        long first=-1;
        long last=-1;
        ArrayList<Long> list = new ArrayList<>();
        
        while(si<=ei){
            long mid =si+(ei-si)/2;
            if(arr[(int)mid]==target){
                first=mid;
                ei=mid-1;
            }
            else if(arr[(int)mid]<target){
               si=mid+1;
            }else{
                ei=mid-1;
            }
            
        }
        si=0;
        ei=n-1;
          while(si<=ei){
            long  mid =si+(ei-si)/2;
            if(arr[(int)mid]==target){
                last=mid;
                si=mid+1;
            }
            else if(arr[(int)mid]>target){
                ei=mid-1;
            }else{
                si=mid+1;
            }
            
        }
        
            list.add(first);
            list.add(last); 
        
        
        return list;
    }
}



//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Long> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}

// } Driver Code Ends