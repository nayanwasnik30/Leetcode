class Solution {
    public int[] asteroidCollision(int[] ast) {
       Stack<Integer> stack = new Stack<>();
       int idx=0;
       while(idx<ast.length){
            int right=ast[idx];
            // collision (+ve vs -ve)
            // who will win ?
            // whos value is greater 
            if(right>0) stack.push(right);
            else {
            if(stack.size()==0 || stack.peek()<0){
                stack.push(right);
            }
            else if(stack.size()>0 && stack.peek() < -right){
                stack.pop();
                idx--;
            }else if(stack.size()>0 && stack.peek()==-right){
                stack.pop();
            }
            }
            idx++;
       } 

       int [] arr= new int[stack.size()];
       int n=stack.size();
       while(n>0){
        n--;
        arr[n]=stack.pop();
       }
       return arr;
    }
}