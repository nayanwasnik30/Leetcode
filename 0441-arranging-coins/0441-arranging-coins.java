class Solution {
    public int arrangeCoins(int n) {
        long si=1;
        long ei=n;
        
        while(si<=ei){
            long mid=si+(ei-si)/2;
            long sum=mid*(mid+1)/2;
            if(sum==n){
            return (int) mid;
            }
            else if(sum<n){
                si=mid+1;
            }else{
                ei=mid-1;
            }
        }
        return (int)ei;
    }
}