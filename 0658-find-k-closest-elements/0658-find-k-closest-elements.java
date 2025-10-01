class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int floors=floor(arr,x);
        int ceil=floors+1;
        for(int count=0;count<k;count++){
            int a=(floors==-1) ? Integer.MAX_VALUE:(x-arr[floors]);
            int b=(ceil==arr.length)?Integer.MAX_VALUE:(arr[ceil]-x);
            if(a<=b){
                floors--;
            }else{
                ceil++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i=floors+1;i<ceil;i++){
            list.add(arr[i]);
        }
        return list;
    }
    public int floor(int []arr,int target){
        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid =left+(right-left)/2;
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