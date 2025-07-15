class Solution {
    public int findPeakElement(int[] arr) {
        int n=arr.length;
        if(n==1) return n-1;
        if(arr[0]>arr[1]) return 0;
         if(arr[n-1]>arr[n-2]) return n-1;
        int left=1;
        int right=arr.length-2;
        while(left<=right){
            int mid=left+(right-left)/2;
            
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid-1]<arr[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }

        return -1;
    }
}