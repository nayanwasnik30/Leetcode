class Solution {
   // List<List<String>> ans;
    String[] map={" ",".;","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
       List<String> list= new ArrayList<>();
       if (digits == null || digits.isEmpty()) {
        return list; // empty input, return empty list
        }
       helper(digits,0,list,"");
       return list;
    }
    public void helper(String s,int idx,List<String>list,String make){
        if(idx >= s.length()){
            list.add(make);
            return ;
        }
        char ch=s.charAt(idx);
        int num=ch-'0';
        String sb=map[num];
        for(int i=0;i<sb.length();i++){
            helper(s,idx+1,list,make+sb.charAt(i));
        }
    }
}