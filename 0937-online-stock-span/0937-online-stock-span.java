class StockSpanner {
    Stack<Integer> stack = new Stack<>();
    ArrayList<Integer> list= new ArrayList<>();
     int span=0;
    public int next(int price) {

        while(stack.size()>0 && list.get(stack.peek())<=price){
            stack.pop();
        }
       
        if(stack.size()>0){
            span=list.size()-stack.peek();
        }else{
            span=list.size()+1;
        }
        stack.push(list.size());
        list.add(price);

        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */