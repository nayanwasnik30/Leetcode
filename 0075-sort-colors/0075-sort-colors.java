class Solution {
    public void sortColors(int[] arr) {
       for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(compare(arr,j-1,j)==true){
                    swap(arr,j-1,j);
                }else{
                    break;
                }
            }
        }
        
    }public boolean compare(int[]arr ,int l,int r){
        if(arr[l]>arr[r]) return true;
        else if(arr[l]<arr[r]) return false;
        else return false;
    }
    public void swap(int []arr,int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        return;
    }

}