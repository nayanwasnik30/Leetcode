class Solution {
    public int [] smallright(int []arr){
        Stack<Integer> stack = new Stack<>();
        int [] temp= new int [arr.length];
        //Arrays.fill(temp,-1);
        
        for(int i=arr.length-1;i>=0;i--){
            while(stack.size()>0 && arr[stack.peek()]>=arr[i]){
               stack.pop();
            }
            if(stack.size()>0){
                temp[i]=stack.peek();
            }else{
                temp[i]=arr.length;
            }
            stack.push(i);
        }
        return temp;
    }
    public int [] smallleft(int []arr){
        Stack<Integer> stack = new Stack<>();
        int [] temp= new int [arr.length];
        //Arrays.fill(temp,-1);
        
        for(int i=0;i<arr.length;i++){
            while(stack.size()>0 && arr[stack.peek()]>=arr[i]){
               stack.pop();
            }
            if(stack.size()>0){
                temp[i]=stack.peek();
            }else{
                temp[i]=-1;
            }
            stack.push(i);
        }
        return temp;
    }
    public int largestRectangleArea(int[] heights) {
        int left [] =smallleft(heights);
        int right [] =smallright(heights);
        int max=0;
        for(int i=0;i<heights.length;i++){
           int curr=heights[i]*(right[i]-left[i]-1);
           max=Math.max(max,curr);
        }
        return max;
    }
}