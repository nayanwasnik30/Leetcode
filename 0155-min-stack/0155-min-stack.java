class MinStack {
    Stack<Integer> min,stack;
    public MinStack() {
        min=new Stack<>();
        stack=new Stack<>();
        min.push(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        stack.push(val);
        int minum=Math.min(min.peek(),val);
        min.push(minum);
    }
    
    public void pop() {
        stack.pop();
        min.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
       return min.peek(); 
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