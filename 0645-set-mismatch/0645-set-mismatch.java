class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int val=nums[i]%(n+1);
            nums[val-1]=nums[val-1]+(n+1);
        }
       int arr[] = new int[2];
       int miss=0;int rep=0;
        for(int i=0;i<n;i++){
            if(nums[i]<(n+1)){
                miss=i+1;
            }
            if(nums[i]/(n+1)>1){
                rep=i+1;
            }
        }
        arr[1]=miss;
        arr[0]=rep;
        return arr;
    }
}