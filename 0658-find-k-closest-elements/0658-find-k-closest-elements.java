class Solution {
    public int floorVal(int []arr,int target){
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
    public List<Integer> findClosestElements(int[] arr, int k, int target) {
        List <Integer> list= new ArrayList<>();
        int floor=floorVal(arr,target);
        int ceil=floor+1;

        for(int i=0;i<k;i++){
            int fval=(floor==-1) ? Integer.MAX_VALUE : (target-arr[floor]);
            int cval=(ceil==arr.length) ? Integer.MAX_VALUE : (arr[ceil]-target)  ;

            if(fval<=cval){
                floor--;
            }else{
                ceil++;
            }
        }

        for(int i=floor+1;i<ceil;i++){
            list.add(arr[i]);
        }
        return list;
    }
}