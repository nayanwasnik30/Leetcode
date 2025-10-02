class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int minradius=0;
        for(int i=0;i<houses.length;i++){
            int radius =search(houses[i],heaters);
            minradius=Math.max(minradius,radius);
        }
        return minradius;
    }
    public int search(int house,int [] heaters){
        int floor=floorarray(house,heaters);
        int ceil=floor+1;

        int dis1=(floor==-1) ? Integer.MAX_VALUE:(house-heaters[floor]);
        int dis2=(ceil==heaters.length)?Integer.MAX_VALUE:(heaters[ceil]-house);
        return Math.min(dis1,dis2);
    }
    public int floorarray(int target,int []heaters){
        int left=0;
        int right=heaters.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(heaters[mid]==target){
                right=mid-1;
            }
            else if(heaters[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return right;
    }
}