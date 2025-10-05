class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        //stair case problem;
        int n=mat[0].length;
        int m=mat.length;
        int left=0; //left pointer travel up to down(row++);
        int right=n-1; //right pointer travel right to left (col--)
        while(left<m && right>-1){
            if(mat[left][right]==target){
                return true;
            }else if(mat[left][right]<target){
               left++;
            }else{
                right--;
            }
        }
        return false;
    }
}