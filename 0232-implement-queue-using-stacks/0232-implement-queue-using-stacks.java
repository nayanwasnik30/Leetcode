class MyQueue {
    Stack<Integer> actual= new Stack<>();
    Stack<Integer> extra= new Stack<>();
     public MyQueue() {
        
    }

    public void push(int x) {
        actual.push(x);
    }
    
    public int pop() {
        while(actual.size()>0){
            extra.push(actual.pop());
        }
        int ans=extra.pop();
        while(extra.size()>0){
            actual.push(extra.pop());
        }

        return ans;
    }
    
    public int peek() {
         while(actual.size()>0){
            extra.push(actual.pop());
        }
        int ans=extra.peek();
        while(extra.size()>0){
            actual.push(extra.pop());
        }

        return ans;
    }
    
    public boolean empty() {
        if(actual.size()==0) return true;
        else return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */