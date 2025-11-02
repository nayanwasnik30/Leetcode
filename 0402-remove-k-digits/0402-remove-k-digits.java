class Solution {
    public String removeKdigits(String s, int k) {
       Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(k>0 && stack.size()>0 && stack.peek()>ch){
                stack.pop();
                k--;
            }
            stack.push(ch);
        } 

        while(k>0){
            stack.pop();
            k--;
        }
        ArrayList<Character> list = new ArrayList<>();
         while (!stack.isEmpty()) {
            list.add(stack.pop());  // Add popped elements to list
        }
        Collections.reverse(list);
        int idx=0;
        while(idx<list.size() && list.get(idx)=='0'){
            idx++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i=idx;i<list.size();i++) {
            sb.append(list.get(i));
        }
         if (sb.length() == 0) {
            return "0";
        }
        return sb.toString();
    }
}