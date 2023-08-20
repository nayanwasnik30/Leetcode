//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
// } Driver Code Ends



class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String str)
    {
        // Your code here
        char[] a = str.toCharArray();
        HashMap<Character ,Integer> map = new HashMap <>();
        for(char ch: a){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        
        int max=0;
       char c=' ';
       for(char key:map.keySet())
       {
            if(map.get(key)>max || map.get(key) ==max && key< c)
            {
                max=map.get(key);
                c=key;
            }
       }
      return c;
    }
    
}