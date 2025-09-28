class Solution {
    public int[] searchRange(int[] nums, int target) {
        int fi=first(nums,target);
        int si=second(nums,target);
        if(fi>si) return new int []{-1,-1};
        return new int []{fi,si};
    }
       
    public int first(int[] nums, int target) {   
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
    }
    public int second(int[] nums, int target) {    
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                left=mid+1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return right;
    }

}