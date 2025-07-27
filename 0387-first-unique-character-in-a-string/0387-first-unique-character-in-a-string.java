class Solution {
    public int firstUniqChar(String str) {
         str=str.toLowerCase();
        int [] arr= new int [26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            arr[ch-'a']++;
        }
        
        for(int i=0;i<str.length();i++){
            int idx=str.charAt(i)-'a';
            if(arr[idx]==1){
                return i;
            }
        }

        return -1;
    }
}