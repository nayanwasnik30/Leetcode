class Solution {
    public int[] smallright(int [] arr){
         Stack<Integer> stack = new Stack<>();
        int temp []= new int [arr.length];

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
    public int[] smallleft(int [] arr){
        Stack<Integer> stack = new Stack<>();
        int temp []= new int [arr.length];

        for(int i=0;i<arr.length;i++){
            while(stack.size()>0 && arr[stack.peek()]>arr[i]){
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
    public int sumSubarrayMins(int[] arr) {
        int left []=smallleft(arr);
        int right []=smallright(arr);
        int min=0;
        // for(int i=0;i<arr.length;i++){
        //     int tsub=((right[i]-left[i]-1)*(right[i]-left[i]))/2;
        //     int lsub=((arr[i]-left[i]-1)*(arr[i]-left[i]))/2;
        //     int rsub=((right[i]-arr[i]-1)*(arr[i]-left[i]))/2;
        //     int curr=tsub-lsub-rsub;
        //     min=Math.max(min,curr);
        // }
        // return min;
        long ans = 0;
        int mod = 1_000_000_007;

        for(int i = 0; i < arr.length; i++){
            long leftCount = i - left[i];
            long rightCount = right[i] - i;
            ans = (ans + (long) arr[i] * leftCount * rightCount) % mod;
        }
        return (int) ans;
    }
}