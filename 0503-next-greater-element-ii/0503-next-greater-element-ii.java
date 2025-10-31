class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int arr [] = new int [nums.length];
        Arrays.fill(arr,-1);
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<nums.length;i++){
            while(stack.size()>0 && nums[stack.peek()]<nums[i]){
                int idx=stack.pop();
                arr[idx]=nums[i];
            }
            stack.push(i);//push index
        }
        for(int i=0;i<nums.length;i++){
            while(stack.size()>0 && nums[stack.peek()]<nums[i]){
                int idx=stack.pop();
                arr[idx]=nums[i];
            }
        }
        return arr;
    }
}