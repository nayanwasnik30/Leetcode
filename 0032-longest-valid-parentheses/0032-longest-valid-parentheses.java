class Solution {
    public int longestValidParentheses(String s) {
        int [] arr= new int [s.length()];
        Stack<Integer> stack = new Stack<>();
        int max=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(ch=='('){
                stack.push(right);
            }else {
                if(stack.size()==0) continue;
                int left=stack.pop();
                arr[right]+=(right-left+1);
                if(left >0 && arr[left-1]>0) arr[right]+=arr[left-1];
                max=Math.max(arr[right],max);
            }
        }

        return max;
    }
}