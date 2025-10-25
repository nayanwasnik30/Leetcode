class MinStack {
    Stack<Long> stack = new Stack<>();
    long min=Long.MAX_VALUE;

    public void push(int val) {
        long val1=1l*val;
        long eny=2*val1-min;
        if(val1>=min){
            stack.push(val1);
        }else{
            stack.push(eny);
            min=val;
        }
    }
    
    public void pop() {
        Long pop1=stack.pop();
        if(pop1>=min) return ;
        min=2*min-pop1;

    }
    
    public int top() {
        long top=stack.peek();
        if(stack.peek()>min) return (int)top;
        return(int)min;
    }
    
    public int getMin() {
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */