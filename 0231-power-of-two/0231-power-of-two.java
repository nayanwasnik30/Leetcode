class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        if (n <= 0) return false;
        int bans=helper(n,2,1,1L);
        if(bans==0) return true;
        else return false;
    }
    public int helper(int n,int two,int idx,long ans){
        if(ans==n) return 0;
        if(ans>n) return -1;
        return helper(n,two,idx+1,ans*two);
    }
}