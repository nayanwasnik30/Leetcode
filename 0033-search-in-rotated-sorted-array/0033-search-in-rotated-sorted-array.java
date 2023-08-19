class Solution {
    public int search(int[] arr, int target) {
       //define range 
       int si=0;
       int ei=arr.length-1;
        
        while(si<=ei){
            int mid = si+(ei-si)/2;
            if(arr[mid]== target){
                return mid;
            }
            else if(arr[si]<=arr[mid]){
                if(arr[si]<= target && arr[mid]>=target){
                    ei=mid-1;
                }else{
                    si=mid+1;
                }
            }
            else{
                if(arr[mid]<= target && arr[ei]>=target ){
                    si=mid+1;
                }else{
                    ei=mid-1;
                }
            }
        }
        return -1;
    }
}