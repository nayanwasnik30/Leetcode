class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int mradius=0;
        for(int ho:houses){
            int radius=binary(ho,heaters);
            mradius=Math.max(mradius,radius);
        }
        return mradius;
    }
    public int binary(int house,int [] heaters){
        int floor=floorVal(house,heaters);
        int ceil=floor+1;

        int fdis=(floor==-1) ?Integer.MAX_VALUE:(house-heaters[floor]);
        int cdis=(ceil==heaters.length) ?Integer.MAX_VALUE:(heaters[ceil]-house);
        return Math.min(fdis,cdis);
    }
    public int floorVal(int target,int []arr){
        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            
            if(arr[mid]==target){
                right=mid-1;
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }

        return right;
    }
}