class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int left=0;int right=n-1;
        int arr []= new int [2];
        while(left<right){
            int sum =nums[left]+nums[right];
            if(sum==target){
                arr[0]=left+1;
                arr[1]=right+1;
                return arr;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }

        return new int []{-1,-1};
    }
}