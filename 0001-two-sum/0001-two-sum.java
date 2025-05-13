class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
       int num1=0;
       int num2=0;
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
          int sum=nums[i]+nums[j];
          if(sum==target){
            num1=i;
            num2=j;
          }
        }
       }
       return new int[]{num1,num2};
    }
}