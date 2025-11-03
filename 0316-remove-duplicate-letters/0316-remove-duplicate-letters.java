class Solution {
    public String removeDuplicateLetters(String s) {
        int [] arr = new int [26];
        boolean [] bool = new boolean[26];
        StringBuilder stack = new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch-'a']++;
        }

        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            arr[ch-'a']--;

            if(bool[ch-'a']==true) continue;

           while(stack.length()>0){
                char top=stack.charAt(stack.length()-1);
                if(top>ch && arr[top-'a']>0){
                    stack.deleteCharAt(stack.length()-1);
                    bool[top-'a']= false;
                }
                else {
                    break;
                }
           }
            bool[ch-'a'] =true;
            stack.append(ch);
        }


        return stack.toString();
    }
}