class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stack= new Stack<>();
        int arr [] = new int [temp.length];

        for(int idx=0;idx<temp.length;idx++){
            int day=temp[idx];
            while(stack.size()>0 && temp[stack.peek()]<day){
                int remove=stack.pop();
                arr[remove]=idx-remove;
            }
            stack.push(idx);
        }

        return arr;
    }
}