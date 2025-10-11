class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        //first implement Binary serch
        //fatten the 3d to 2d ;
        int n=mat[0].length;
        int m=mat.length;
        int left=0;
        int right=(n*m)-1;//total length
        while(left<=right){
            int mid=left+(right-left)/2;
            //left and right athe pointer where to but do not know whts in there 
            //there fore convert pointer to get cordinates from mid;
            int l=mid/n;int r=mid%n;
            int sum=mat[l][r];
            if(sum==target){
                return true;
            }else if(sum<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }

        return false;
    }
}