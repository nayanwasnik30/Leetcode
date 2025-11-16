class Solution {
    public double myPow(double x, int n) {
        if(n<0) return 1.0/helper(x,-1L*n);
        return helper(x,n);
    }
     public double helper(double x, long n) {
       if(n==0) return 1.0;

       if(n%2 != 0){
        double sans=helper(x,n-1);
        return sans*x;
       }
       double sans=helper(x,n/2);
       return sans*sans;
    }
}