class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length-1;
        int pviot=pviotfind(nums,target);
        if(pviot==0){
            return sorted(nums,target,0,nums.length-1);
        }
        else if(target<nums[0]){
            return sorted(nums,target,pviot,nums.length-1);
        }else{
            return sorted(nums,target,0,pviot-1);
        }

    }
    public int sorted(int []nums,int target,int left,int right){
         while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }

        return -1;
    }public int pviotfind(int []nums,int target){
        int left=0;
        int right=nums.length-1;
        
         while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>=nums[0]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }

        return left;
    }
}