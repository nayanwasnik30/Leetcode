class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        //stair case problem;
        int n=mat[0].length;
        int m=mat.length;
        int left=0;
        int right=(n*m)-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int l=mid/n; int r=mid%n;
            if(mat[l][r]==target){
                return true;
            }else if(mat[l][r]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return false;
    }
}