class Solution {
    public boolean validateStackSequences(int[] push, int[] pop) {
        if(push.length==1)return true;
        Stack<Integer> stack= new Stack<>();
        Stack<Integer> stack2= new Stack<>();
        for(int i=pop.length-1;i>=0;i--){
            stack2.push(pop[i]);
        }
        int i=0;
        while(i<push.length || !stack.isEmpty()){
            if(stack.size()> 0 && stack2.size()>0 && stack.peek().equals(stack2.peek())){
                System.out.print(stack.peek());
                stack.pop();
                stack2.pop();
            }
            else if(i<push.length){
            stack.push(push[i]);
            i++;
            }else{
                break;
            }
        }
        if(stack.size()==0){
            return true;
        }
        return false;

    }
}