class Solution {
    public int mySqrt(int x) {
        long left=0;
        long right=x;

        while(left<=right){
            long mid=left+(right-left)/2;

            if(mid*mid==x){
                return (int)mid;
            }else if(mid*mid<x){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return (int)right;
    }
}