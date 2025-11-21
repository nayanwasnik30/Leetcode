class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if (n <= 0) return false;
        int bans=helper(n,4,1,1L);
        if(bans==0) return true;
        else return false;
    }
    public int helper(int n,int three,int idx,long ans){
        if(ans==n) return 0;
        if(ans>n) return -1;
        return helper(n,three,idx+1,ans*three);
    }
}
