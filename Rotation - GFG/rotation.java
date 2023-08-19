//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int ans = new Solution().findKRotation(a, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int findKRotation(int arr[], int n) {
        if(arr[0]<=arr[n-1]){
            return 0;
        }
        
        int si=0;
        int ei=n-1;
        
        while(si<=ei){
            int mid =si+(ei-si)/2;
            
            if(mid !=0 && arr[mid-1]> arr[mid]){
                return mid;
            }
            else if(arr[mid]<arr[ei]){
                ei =mid-1;
            }else{
                si=mid+1;
            }
            
        }
          return 0;
    }
}