//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        int ans=-1;
        HashMap<Character,Integer> map=new HashMap<>();
        int i=-1;
        int j=-1;
        while(true){
            boolean f1=false;
            boolean f2=false;
            while(i<s.length()-1){
                f1=true;
                i++;
                char ch=s.charAt(i);
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
                if(map.size()<k){
                    continue;
                }
                else if(map.size()==k){
                        int len=i-j;
                        if(len>ans){
                            ans=len;
                        }
                }
                    else{
                        break;
                    }
                }
                while(j<i){
                    f2=true;
                    j++;
                    char ch=s.charAt(j);
                    if(map.get(ch)==1){
                        map.remove(ch);
                    }
                    else{
                        map.put(ch,map.get(ch)-1);
                    }
                    if(map.size()>k){
                        continue;
                    }else if(map.size()==k){
                        int len=i-j;
                        if(len>ans){
                            ans=len;
                        }
                        break;
                    }
                }
                if(f1==false && f2==false){
                    break;
            }
            }
            return ans;
    }
}