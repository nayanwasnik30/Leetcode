class Solution {
    public int[] asteroidCollision(int[] ast) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<ast.length;i++){
            int temp=ast[i];
            while(stack.size()>0 && stack.peek()>0 && temp < 0){//check when  is the collsion(+ vs -)
                int sum=stack.peek()+temp;
                if(sum<0){  //if sum is < 0
                    stack.pop();
                }
                else if(sum>0){ //if sum is > 0 
                    temp=0;
                    break;
                }else { //if sum is ==0
                    temp=0;
                    stack.pop();
                    break;
                }
            }
            if(temp!=0)stack.push(temp);
        }
        int n  = stack.size();
        int arr[] = new int[n];
        while(n > 0) {
             n--;
            arr[n] = stack.pop();
           
        }
        return arr;
    }
}