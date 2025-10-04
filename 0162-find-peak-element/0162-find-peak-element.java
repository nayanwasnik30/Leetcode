class Solution {
    public int findPeakElement(int[] arr) {
        int left=1;
        int right=arr.length-2;
        int n=arr.length;
        if(n==1){
            return 0;
        }
        if(arr[n-1]>arr[n-2]){
            return (n-1);
        }

        while(left<=right){
            int mid=left+(right-left)/2;

            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]>arr[mid-1]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }

        return 0;
    }
}