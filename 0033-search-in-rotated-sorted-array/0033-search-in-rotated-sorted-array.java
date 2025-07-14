class Solution {
    public int pindex(int []arr){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid =left+(right-left)/2;

            if(arr[0]<=arr[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
    }
    public int search(int[] nums, int target) {
        int piviot=pindex(nums);
        if(piviot==0){
            return binary(nums,0,nums.length-1,target);
        }
        else if(target<nums[0]){
            return binary(nums,piviot,nums.length-1,target);
        }else{
            return binary(nums,0,piviot-1,target);
        }
    }
    public int binary(int []arr,int left,int right,int target){
        
        while(left<=right){
            int mid=left+(right-left)/2;

            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}