class Solution {
    public int arrangeCoins(int n) {
        Stack<Integer>  stack = new Stack<>();
        for(int i=1;i<=n;i++){
            stack.push(i);
            n=n-i;
        }
        return stack.peek();
    }
}