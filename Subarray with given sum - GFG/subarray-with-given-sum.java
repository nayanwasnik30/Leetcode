//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
             ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        int currentSum = 0;

        for (int i = 0; i < n; i++) {
            currentSum += arr[i];

            if (currentSum == s) {
                result.add(1); // Start index
                result.add(i + 1); // End index (convert to 1-based indexing)
                return result;
            }

            int requiredSum = currentSum - s;
            if (prefixSumMap.containsKey(requiredSum)) {
                int startIndex = prefixSumMap.get(requiredSum) + 2; // Convert to 1-based indexing
                int endIndex = i + 1;
                result.add(startIndex);
                result.add(endIndex);
                return result;
            }

            prefixSumMap.put(currentSum, i);
        }

        result.add(-1);
        return result;
    }
}