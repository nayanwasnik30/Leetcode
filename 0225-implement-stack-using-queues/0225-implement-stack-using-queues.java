class MyStack {
    Queue<Integer> stack= new ArrayDeque<>();
    
    public void push(int x) {
        stack.add(x);
    }
    
    public int pop() {
        for(int idx=1;idx<stack.size();idx++){
            stack.add(stack.remove());
        }
        int ans=stack.remove();
        return ans;
    }
    
    public int top() {
        for(int idx=1;idx<stack.size();idx++){
            stack.add(stack.remove());
        }
        int ans=stack.remove();
        stack.add(ans);
        return ans;
    }
    
    public boolean empty() {
        if(stack.size()==0) return true;
        else return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */