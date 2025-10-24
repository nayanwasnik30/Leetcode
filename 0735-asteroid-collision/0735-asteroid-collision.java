class Solution {
    public int[] asteroidCollision(int[] ass) {
        Stack<Integer> stack = new Stack<>();
        for(int idx=0;idx<ass.length;idx++){
            int num=ass[idx];
            if(num>0) stack.push(num);
            else if(stack.size()==0 || stack.peek()<0){
                stack.push(num);
            }
            else if(Math.abs(stack.peek())<Math.abs(num)){
                stack.pop();
                idx--;
            }
            else if(Math.abs(stack.peek())==Math.abs(num)){
                stack.pop();
            }

        }
        int n  = stack.size();
        int arr[] = new int[n];
        while(n > 0) {
            arr[--n] = stack.pop();
        }
        return arr;
    }
}